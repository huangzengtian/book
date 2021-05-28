package com.shichimi.book.vo;

import java.util.Map;

/**
 * @author Huang Zengtian on 2021/5/27 20:29
 */
public class ResultVO {
    public static final String SUCCESS = "1";
    public static final String FAIL = "-1";

    /**
     * 返回的消息
     */
    public String message;

    /**
     * 响应状态码
     */
    public String code;

    /**
     * 携带的数据
     */
    public Object data;

    /**
     * 携带的额外数据
     */
    public Map<String, Object> extraData;

    public ResultVO() {
    }

    public ResultVO(String message, String code, Object data, Map<String, Object> extraData) {
        this.message = message;
        this.code = code;
        this.data = data;
        this.extraData = extraData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Map<String, Object> getExtraData() {
        return extraData;
    }

    public void setExtraData(Map<String, Object> extraData) {
        this.extraData = extraData;
    }

    public static ResultVO success(String message) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(SUCCESS);
        resultVO.setMessage(message);
        return resultVO;
    }

    public static ResultVO success(String message, Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(SUCCESS);
        resultVO.setMessage(message);
        resultVO.setData(data);
        return resultVO;
    }

    public static ResultVO success(String message, Object data, Map<String, Object> extraData) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(SUCCESS);
        resultVO.setMessage(message);
        resultVO.setData(data);
        resultVO.setExtraData(extraData);
        return resultVO;
    }

    public static ResultVO fail(String message) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(FAIL);
        resultVO.setMessage(message);
        return resultVO;
    }

    public static ResultVO fail(String message, Object data) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(FAIL);
        resultVO.setMessage(message);
        resultVO.setData(data);
        return resultVO;
    }
}
