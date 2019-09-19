package co.topc.base.message.sms.mapper;

import co.topc.base.message.sms.entity.IemsSmsTemplate;
import co.topc.base.message.sms.entity.IemsSmsTemplateExample;
import org.springframework.stereotype.Repository;

/**
 * IemsSmsTemplateMapper继承基类
 */
@Repository
public interface IemsSmsTemplateMapper extends MyBatisBaseDao<IemsSmsTemplate, String, IemsSmsTemplateExample> {
}