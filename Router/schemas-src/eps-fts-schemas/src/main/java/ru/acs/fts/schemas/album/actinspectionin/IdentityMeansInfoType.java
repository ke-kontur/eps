
package ru.acs.fts.schemas.album.actinspectionin;

import java.util.ArrayList;
import java.util.List;

/** 
 * Средства идентификации
 */
public class IdentityMeansInfoType
{
    private String identBeforeNum;
    private String identCrashFlag;
    private String identEndNum;
    private String identMeansDesc;
    private List<IdentifyMeanType> identifyMeanList = new ArrayList<IdentifyMeanType>();

    /** 
     * Get the 'IdentBeforeNum' element value. Кол-во средств идентификации до начала проведения досмотра (0 - без средств идентификации)
     * 
     * @return value
     */
    public String getIdentBeforeNum() {
        return identBeforeNum;
    }

    /** 
     * Set the 'IdentBeforeNum' element value. Кол-во средств идентификации до начала проведения досмотра (0 - без средств идентификации)
     * 
     * @param identBeforeNum
     */
    public void setIdentBeforeNum(String identBeforeNum) {
        this.identBeforeNum = identBeforeNum;
    }

    /** 
     * Get the 'IdentCrashFlag' element value. Признак нарушения средств идентификации ("0" - не нарушены, "1" - нарушены)
     * 
     * @return value
     */
    public String getIdentCrashFlag() {
        return identCrashFlag;
    }

    /** 
     * Set the 'IdentCrashFlag' element value. Признак нарушения средств идентификации ("0" - не нарушены, "1" - нарушены)
     * 
     * @param identCrashFlag
     */
    public void setIdentCrashFlag(String identCrashFlag) {
        this.identCrashFlag = identCrashFlag;
    }

    /** 
     * Get the 'IdentEndNum' element value. Кол-во наложенных средств идентификации после проведения таможенного досмотра (0 - без средств идентификации)
     * 
     * @return value
     */
    public String getIdentEndNum() {
        return identEndNum;
    }

    /** 
     * Set the 'IdentEndNum' element value. Кол-во наложенных средств идентификации после проведения таможенного досмотра (0 - без средств идентификации)
     * 
     * @param identEndNum
     */
    public void setIdentEndNum(String identEndNum) {
        this.identEndNum = identEndNum;
    }

    /** 
     * Get the 'IdentMeansDesc' element value. Общие примечания по средствам идентификации
     * 
     * @return value
     */
    public String getIdentMeansDesc() {
        return identMeansDesc;
    }

    /** 
     * Set the 'IdentMeansDesc' element value. Общие примечания по средствам идентификации
     * 
     * @param identMeansDesc
     */
    public void setIdentMeansDesc(String identMeansDesc) {
        this.identMeansDesc = identMeansDesc;
    }

    /** 
     * Get the list of 'IdentifyMean' element items. Cредство идентификации
     * 
     * @return list
     */
    public List<IdentifyMeanType> getIdentifyMeanList() {
        return identifyMeanList;
    }

    /** 
     * Set the list of 'IdentifyMean' element items. Cредство идентификации
     * 
     * @param list
     */
    public void setIdentifyMeanList(List<IdentifyMeanType> list) {
        identifyMeanList = list;
    }
}
