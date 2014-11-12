
package ru.acs.fts.schemas.album.revealingtransportpp;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Сведения о транспортном средстве
 */
public class TransportType
{
    private String weight;
    private String batchQuantity;
    private String factWeight;
    private String PIRegID;
    private int choiceSelect = -1;
    private static final int CAR_INFORMATION_CHOICE = 0;
    private static final int TRAIN_INFORMATION_CHOICE = 1;
    private CarInformationType carInformation;
    private TrainInformationType trainInformation;
    private OrganizationType carrier;
    private List<MDPInfoType> MDPInfoList = new ArrayList<MDPInfoType>();

    /** 
     * Get the 'Weight' element value. Вес ТС с товарами по документам в кг
     * 
     * @return value
     */
    public String getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. Вес ТС с товарами по документам в кг
     * 
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /** 
     * Get the 'BatchQuantity' element value. Количество партий
     * 
     * @return value
     */
    public String getBatchQuantity() {
        return batchQuantity;
    }

    /** 
     * Set the 'BatchQuantity' element value. Количество партий
     * 
     * @param batchQuantity
     */
    public void setBatchQuantity(String batchQuantity) {
        this.batchQuantity = batchQuantity;
    }

    /** 
     * Get the 'FactWeight' element value. Вес ТС с товаром фактический (результат взвешивания) в кг
     * 
     * @return value
     */
    public String getFactWeight() {
        return factWeight;
    }

    /** 
     * Set the 'FactWeight' element value. Вес ТС с товаром фактический (результат взвешивания) в кг
     * 
     * @param factWeight
     */
    public void setFactWeight(String factWeight) {
        this.factWeight = factWeight;
    }

    /** 
     * Get the 'PI_RegID' element value. Регистрационный идентификатор предварительной информации
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. Регистрационный идентификатор предварительной информации
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        this.PIRegID = PIRegID;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if CarInformation is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifCarInformation() {
        return choiceSelect == CAR_INFORMATION_CHOICE;
    }

    /** 
     * Get the 'CarInformation' element value. Сведения об автомобильном транспорте
     * 
     * @return value
     */
    public CarInformationType getCarInformation() {
        return carInformation;
    }

    /** 
     * Set the 'CarInformation' element value. Сведения об автомобильном транспорте
     * 
     * @param carInformation
     */
    public void setCarInformation(CarInformationType carInformation) {
        setChoiceSelect(CAR_INFORMATION_CHOICE);
        this.carInformation = carInformation;
    }

    /** 
     * Check if TrainInformation is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTrainInformation() {
        return choiceSelect == TRAIN_INFORMATION_CHOICE;
    }

    /** 
     * Get the 'TrainInformation' element value. Сведения о железнодорожном транспорте
     * 
     * @return value
     */
    public TrainInformationType getTrainInformation() {
        return trainInformation;
    }

    /** 
     * Set the 'TrainInformation' element value. Сведения о железнодорожном транспорте
     * 
     * @param trainInformation
     */
    public void setTrainInformation(TrainInformationType trainInformation) {
        setChoiceSelect(TRAIN_INFORMATION_CHOICE);
        this.trainInformation = trainInformation;
    }

    /** 
     * Get the 'Carrier' element value. Сведения о перевозчике товаров
     * 
     * @return value
     */
    public OrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Сведения о перевозчике товаров
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the list of 'MDPInfo' element items. Информация о книжке МДП
     * 
     * @return list
     */
    public List<MDPInfoType> getMDPInfoList() {
        return MDPInfoList;
    }

    /** 
     * Set the list of 'MDPInfo' element items. Информация о книжке МДП
     * 
     * @param list
     */
    public void setMDPInfoList(List<MDPInfoType> list) {
        MDPInfoList = list;
    }
}
