package vip.efactory.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import vip.efactory.base.BaseMapper;
import vip.efactory.entity.SysLog;
import vip.efactory.service.dto.LogErrorDTO;

@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LogErrorMapper extends BaseMapper<LogErrorDTO, SysLog> {

}
