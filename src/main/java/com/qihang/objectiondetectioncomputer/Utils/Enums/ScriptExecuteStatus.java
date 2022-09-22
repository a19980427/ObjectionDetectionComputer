package com.qihang.objectiondetectioncomputer.Utils.Enums;

import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

/**
 * @author qihang
 * @create 2022-09-18 下午  10:35
 */

@AllArgsConstructor
@Getter
public enum ScriptExecuteStatus {
    DETECTED(1, "检测到目标"),
    NO_DETECTED(0, "未检测到目标"),
    FAILURE(-1, "检测失败"),
    ;

    private final Integer code;
    private final String msg;

    private static final Map<Integer, ScriptExecuteStatus> MAP = Maps.newHashMap();

    static {
        for (ScriptExecuteStatus status : ScriptExecuteStatus.values()) {
            MAP.put(status.code, status);
        }
    }

    public static ScriptExecuteStatus getByCode(Integer code) {
        return MAP.get(code);
    }
}
