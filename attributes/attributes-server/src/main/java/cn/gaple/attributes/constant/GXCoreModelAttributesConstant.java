package cn.gaple.attributes.constant;

import com.geoxus.core.framework.annotation.GXFieldComment;

public class GXCoreModelAttributesConstant {
    @GXFieldComment(zhDesc = "主键ID")
    public static final String PRIMARY_KEY = "model_attributes_id";

    @GXFieldComment(zhDesc = "数据表名")
    public static final String TABLE_NAME = "core_model_attributes";

    @GXFieldComment(zhDesc = "数据表的别名")
    public static final String TABLE_ALIAS_NAME = "core_model_attributes";

    @GXFieldComment(zhDesc = "模型的值")
    public static final String MODEL_IDENTIFICATION_VALUE = "core_model_attributes";

    private GXCoreModelAttributesConstant() {
    }
}