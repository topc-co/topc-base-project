package co.topc.base.message.sms.mapper;

import co.topc.base.message.sms.entity.IemsSmsResponse;
import co.topc.base.message.sms.entity.IemsSmsResponseExample;
import org.springframework.stereotype.Repository;

/**
 * IemsSmsResponseMapper继承基类
 */
@Repository
public interface IemsSmsResponseMapper extends MyBatisBaseDao<IemsSmsResponse, String, IemsSmsResponseExample> {
}