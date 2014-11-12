
package ru.acs.fts.schemas.album.actinspection;

/** 
 * ����� ���������
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
     * Get the 'Model' element value. �����, ������ (���������)
     * 
     * @return value
     */
    public String getModel() {
        return model;
    }

    /** 
     * Set the 'Model' element value. �����, ������ (���������)
     * 
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Get the 'VINID' element value. ����������������� ����� (VIN) ������������� ��������
     * 
     * @return value
     */
    public String getVINID() {
        return VINID;
    }

    /** 
     * Set the 'VINID' element value. ����������������� ����� (VIN) ������������� ��������
     * 
     * @param VINID
     */
    public void setVINID(String VINID) {
        this.VINID = VINID;
    }

    /** 
     * Get the 'EngineModel' element value. ������ ���������
     * 
     * @return value
     */
    public String getEngineModel() {
        return engineModel;
    }

    /** 
     * Set the 'EngineModel' element value. ������ ���������
     * 
     * @param engineModel
     */
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    /** 
     * Get the 'EngineNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /** 
     * Set the 'EngineNumber' element value. ����� ���������
     * 
     * @param engineNumber
     */
    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    /** 
     * Get the 'CapstanNumber' element value. ����� ����
     * 
     * @return value
     */
    public String getCapstanNumber() {
        return capstanNumber;
    }

    /** 
     * Set the 'CapstanNumber' element value. ����� ����
     * 
     * @param capstanNumber
     */
    public void setCapstanNumber(String capstanNumber) {
        this.capstanNumber = capstanNumber;
    }

    /** 
     * Get the 'WheelSize' element value. ����������� ����� (��������� �� �������� ��������)
     * 
     * @return value
     */
    public String getWheelSize() {
        return wheelSize;
    }

    /** 
     * Set the 'WheelSize' element value. ����������� ����� (��������� �� �������� ��������)
     * 
     * @param wheelSize
     */
    public void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }

    /** 
     * Get the 'NumberOfPhoto' element value. ���������� ����������� ����������
     * 
     * @return value
     */
    public String getNumberOfPhoto() {
        return numberOfPhoto;
    }

    /** 
     * Set the 'NumberOfPhoto' element value. ���������� ����������� ����������
     * 
     * @param numberOfPhoto
     */
    public void setNumberOfPhoto(String numberOfPhoto) {
        this.numberOfPhoto = numberOfPhoto;
    }
}
