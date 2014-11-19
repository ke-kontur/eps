
package ru.acs.fts.schemas.album.resulttk;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Сведения из инструментального контроля
 */
public class InstrumentalControlType
{
    private String number;
    private String dateTime;
    private String passNumber;
    private String course;
    private CustomsPersonType instrumentalEmployee;
    private WeightType weight;
    private SizeType size;
    private TransportMeansBaseType auto;
    private List<CheckViolationType> violSmokeNoiseList = new ArrayList<CheckViolationType>();
    private UsingPassType passWeight;

    /** 
     * Get the 'Number' element value. Номер листа учета
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер листа учета
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'DateTime' element value. Дата/время начала инструментального контроля
     * 
     * @return value
     */
    public String getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'DateTime' element value. Дата/время начала инструментального контроля
     * 
     * @param dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /** 
     * Get the 'PassNumber' element value. Номер талона контроля
     * 
     * @return value
     */
    public String getPassNumber() {
        return passNumber;
    }

    /** 
     * Set the 'PassNumber' element value. Номер талона контроля
     * 
     * @param passNumber
     */
    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }

    /** 
     * Get the 'Course' element value. Шифр поездки
     * 
     * @return value
     */
    public String getCourse() {
        return course;
    }

    /** 
     * Set the 'Course' element value. Шифр поездки
     * 
     * @param course
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /** 
     * Get the 'InstrumentalEmployee' element value. Инспектор, проводивший инструментальный контроль
     * 
     * @return value
     */
    public CustomsPersonType getInstrumentalEmployee() {
        return instrumentalEmployee;
    }

    /** 
     * Set the 'InstrumentalEmployee' element value. Инспектор, проводивший инструментальный контроль
     * 
     * @param instrumentalEmployee
     */
    public void setInstrumentalEmployee(CustomsPersonType instrumentalEmployee) {
        this.instrumentalEmployee = instrumentalEmployee;
    }

    /** 
     * Get the 'Weight' element value. Весовые параметры ТС
     * 
     * @return value
     */
    public WeightType getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. Весовые параметры ТС
     * 
     * @param weight
     */
    public void setWeight(WeightType weight) {
        this.weight = weight;
    }

    /** 
     * Get the 'Size' element value. Габаритные параметры ТС
     * 
     * @return value
     */
    public SizeType getSize() {
        return size;
    }

    /** 
     * Set the 'Size' element value. Габаритные параметры ТС
     * 
     * @param size
     */
    public void setSize(SizeType size) {
        this.size = size;
    }

    /** 
     * Get the 'Auto' element value. Регистрационные данные ТС
     * 
     * @return value
     */
    public TransportMeansBaseType getAuto() {
        return auto;
    }

    /** 
     * Set the 'Auto' element value. Регистрационные данные ТС
     * 
     * @param auto
     */
    public void setAuto(TransportMeansBaseType auto) {
        this.auto = auto;
    }

    /** 
     * Get the list of 'ViolSmokeNoise' element items. Соответствие дымности (токсичности)/уровню шумности
     * 
     * @return list
     */
    public List<CheckViolationType> getViolSmokeNoiseList() {
        return violSmokeNoiseList;
    }

    /** 
     * Set the list of 'ViolSmokeNoise' element items. Соответствие дымности (токсичности)/уровню шумности
     * 
     * @param list
     */
    public void setViolSmokeNoiseList(List<CheckViolationType> list) {
        violSmokeNoiseList = list;
    }

    /** 
     * Get the 'PassWeight' element value. МСВТС
     * 
     * @return value
     */
    public UsingPassType getPassWeight() {
        return passWeight;
    }

    /** 
     * Set the 'PassWeight' element value. МСВТС
     * 
     * @param passWeight
     */
    public void setPassWeight(UsingPassType passWeight) {
        this.passWeight = passWeight;
    }
}
