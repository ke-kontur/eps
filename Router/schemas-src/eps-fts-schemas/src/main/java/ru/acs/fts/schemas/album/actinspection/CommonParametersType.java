
package ru.acs.fts.schemas.album.actinspection;

/** 
 * Общие параметры
 */
public class CommonParametersType
{
    private String model;
    private String VINID;
    private String engineModel;
    private String engineNumber;
    private String capstanNumber;
    private String wheelSize;
    private String numberOfPhoto;

    /** 
     * Get the 'Model' element value. Марка, модель (полностью)
     * 
     * @return value
     */
    public String getModel() {
        return model;
    }

    /** 
     * Set the 'Model' element value. Марка, модель (полностью)
     * 
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Get the 'VINID' element value. Идентификационный номер (VIN) транспортного средства
     * 
     * @return value
     */
    public String getVINID() {
        return VINID;
    }

    /** 
     * Set the 'VINID' element value. Идентификационный номер (VIN) транспортного средства
     * 
     * @param VINID
     */
    public void setVINID(String VINID) {
        this.VINID = VINID;
    }

    /** 
     * Get the 'EngineModel' element value. Модель двигателя
     * 
     * @return value
     */
    public String getEngineModel() {
        return engineModel;
    }

    /** 
     * Set the 'EngineModel' element value. Модель двигателя
     * 
     * @param engineModel
     */
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    /** 
     * Get the 'EngineNumber' element value. Номер двигателя
     * 
     * @return value
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /** 
     * Set the 'EngineNumber' element value. Номер двигателя
     * 
     * @param engineNumber
     */
    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    /** 
     * Get the 'CapstanNumber' element value. Число осей
     * 
     * @return value
     */
    public String getCapstanNumber() {
        return capstanNumber;
    }

    /** 
     * Set the 'CapstanNumber' element value. Число осей
     * 
     * @param capstanNumber
     */
    public void setCapstanNumber(String capstanNumber) {
        this.capstanNumber = capstanNumber;
    }

    /** 
     * Get the 'WheelSize' element value. Размерность колес (указанная на боковине покрышки)
     * 
     * @return value
     */
    public String getWheelSize() {
        return wheelSize;
    }

    /** 
     * Set the 'WheelSize' element value. Размерность колес (указанная на боковине покрышки)
     * 
     * @param wheelSize
     */
    public void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }

    /** 
     * Get the 'NumberOfPhoto' element value. Количество прилагаемых фотографий
     * 
     * @return value
     */
    public String getNumberOfPhoto() {
        return numberOfPhoto;
    }

    /** 
     * Set the 'NumberOfPhoto' element value. Количество прилагаемых фотографий
     * 
     * @param numberOfPhoto
     */
    public void setNumberOfPhoto(String numberOfPhoto) {
        this.numberOfPhoto = numberOfPhoto;
    }
}
