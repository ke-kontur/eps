
package ru.acs.fts.schemas.album.foivrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * ������ ������� �� ����� ���������� � ����������
 */
public class CheckRequestDataType
{
    private CUCustomsType post;
    private CUOrganizationType carrier;
    private AutoTrainType autoTrain;

    /** 
     * Get the 'Post' element value. ����
     * 
     * @return value
     */
    public CUCustomsType getPost() {
        return post;
    }

    /** 
     * Set the 'Post' element value. ����
     * 
     * @param post
     */
    public void setPost(CUCustomsType post) {
        this.post = post;
    }

    /** 
     * Get the 'Carrier' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ����������
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'AutoTrain' element value. �������� � ������������ �������� (���������)
     * 
     * @return value
     */
    public AutoTrainType getAutoTrain() {
        return autoTrain;
    }

    /** 
     * Set the 'AutoTrain' element value. �������� � ������������ �������� (���������)
     * 
     * @param autoTrain
     */
    public void setAutoTrain(AutoTrainType autoTrain) {
        this.autoTrain = autoTrain;
    }
}
