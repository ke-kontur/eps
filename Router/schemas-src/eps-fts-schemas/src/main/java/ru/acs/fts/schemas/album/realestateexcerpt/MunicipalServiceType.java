
package ru.acs.fts.schemas.album.realestateexcerpt;

import org.joda.time.LocalDate;

/** 
 * ��������������� ��� ������������� ������
 */
public class MunicipalServiceType
{
    private String baseRequest;
    private String normativeAct;
    private String post;
    private LocalDate answerDate;
    private String serviceName;
    private String serviceCode;

    /** 
     * Get the 'BaseRequest' element value. ��������� ������� ��������
     * 
     * @return value
     */
    public String getBaseRequest() {
        return baseRequest;
    }

    /** 
     * Set the 'BaseRequest' element value. ��������� ������� ��������
     * 
     * @param baseRequest
     */
    public void setBaseRequest(String baseRequest) {
        this.baseRequest = baseRequest;
    }

    /** 
     * Get the 'NormativeAct' element value. ��������� ������������ ����
     * 
     * @return value
     */
    public String getNormativeAct() {
        return normativeAct;
    }

    /** 
     * Set the 'NormativeAct' element value. ��������� ������������ ����
     * 
     * @param normativeAct
     */
    public void setNormativeAct(String normativeAct) {
        this.normativeAct = normativeAct;
    }

    /** 
     * Get the 'Post' element value. ���������
     * 
     * @return value
     */
    public String getPost() {
        return post;
    }

    /** 
     * Set the 'Post' element value. ���������
     * 
     * @param post
     */
    public void setPost(String post) {
        this.post = post;
    }

    /** 
     * Get the 'AnswerDate' element value. ���� ���������� ������ �� ���������������� ������
     * 
     * @return value
     */
    public LocalDate getAnswerDate() {
        return answerDate;
    }

    /** 
     * Set the 'AnswerDate' element value. ���� ���������� ������ �� ���������������� ������
     * 
     * @param answerDate
     */
    public void setAnswerDate(LocalDate answerDate) {
        this.answerDate = answerDate;
    }

    /** 
     * Get the 'ServiceName' element value. ������������ ������
     * 
     * @return value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** 
     * Set the 'ServiceName' element value. ������������ ������
     * 
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /** 
     * Get the 'ServiceCode' element value. ��� ������
     * 
     * @return value
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /** 
     * Set the 'ServiceCode' element value. ��� ������
     * 
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
}
