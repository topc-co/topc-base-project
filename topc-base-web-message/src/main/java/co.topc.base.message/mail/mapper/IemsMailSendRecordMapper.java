package co.topc.base.message.mail.mapper;

import co.topc.base.message.mail.entity.IemsMailSendRecord;
import co.topc.base.message.mail.entity.IemsMailSendRecordExample;
import co.topc.base.message.sms.mapper.MyBatisBaseDao;
import org.springframework.stereotype.Repository;

/**
 * IemsMailSendRecordMapper继承基类
 */
@Repository
public interface IemsMailSendRecordMapper extends MyBatisBaseDao<IemsMailSendRecord, String, IemsMailSendRecordExample> {
}