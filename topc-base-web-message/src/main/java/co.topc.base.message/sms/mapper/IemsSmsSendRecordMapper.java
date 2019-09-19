package co.topc.base.message.sms.mapper;

import co.topc.base.message.sms.entity.IemsSmsSendRecord;
import co.topc.base.message.sms.entity.IemsSmsSendRecordExample;
import org.springframework.stereotype.Repository;

/**
 * IemsSmsSendRecordMapper继承基类
 */
@Repository
public interface IemsSmsSendRecordMapper extends MyBatisBaseDao<IemsSmsSendRecord, String, IemsSmsSendRecordExample> {
}