
package ru.acs.fts.schemas.album.foivrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Данные запроса на поиск информации о разрешении
 */
public class CheckRequestDataType
{
    private CUCustomsType post;
    private CUOrganizationType carrier;
    private AutoTrainType autoTrain;

    /** 
     * Get the 'Post' element value. Пост
     * 
     * @return value
     */
    public CUCustomsType getPost() {
        return post;
    }

    /** 
     * Set the 'Post' element value. Пост
     * 
     * @param post
     */
    public void setPost(CUCustomsType post) {
        this.post = post;
    }

    /** 
     * Get the 'Carrier' element value. Перевозчик
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'AutoTrain' element value. Сведения о транспортном средстве (автопоезд)
     * 
     * @return value
     */
    public AutoTrainType getAutoTrain() {
        return autoTrain;
    }

    /** 
     * Set the 'AutoTrain' element value. Сведения о транспортном средстве (автопоезд)
     * 
     * @param autoTrain
     */
    public void setAutoTrain(AutoTrainType autoTrain) {
        this.autoTrain = autoTrain;
    }
}
