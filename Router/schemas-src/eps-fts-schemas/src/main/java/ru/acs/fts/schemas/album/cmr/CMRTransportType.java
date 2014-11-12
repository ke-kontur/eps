
package ru.acs.fts.schemas.album.cmr;

/** 
 * ”слови€ транспортировки (гр.14,15,20,25,26)
 */
public class CMRTransportType
{
    private String specialConditionsText;
    private String primeMoverStateSignID;
    private String trailerStateSignID;

    /** 
     * Get the 'SpecialConditionsText' element value. ќсобые согласованные услови€
     * 
     * @return value
     */
    public String getSpecialConditionsText() {
        return specialConditionsText;
    }

    /** 
     * Set the 'SpecialConditionsText' element value. ќсобые согласованные услови€
     * 
     * @param specialConditionsText
     */
    public void setSpecialConditionsText(String specialConditionsText) {
        this.specialConditionsText = specialConditionsText;
    }

    /** 
     * Get the 'PrimeMoverStateSignID' element value. –егистрационный номер т€гача
     * 
     * @return value
     */
    public String getPrimeMoverStateSignID() {
        return primeMoverStateSignID;
    }

    /** 
     * Set the 'PrimeMoverStateSignID' element value. –егистрационный номер т€гача
     * 
     * @param primeMoverStateSignID
     */
    public void setPrimeMoverStateSignID(String primeMoverStateSignID) {
        this.primeMoverStateSignID = primeMoverStateSignID;
    }

    /** 
     * Get the 'TrailerStateSignID' element value. –егистрационный номер прицепа
     * 
     * @return value
     */
    public String getTrailerStateSignID() {
        return trailerStateSignID;
    }

    /** 
     * Set the 'TrailerStateSignID' element value. –егистрационный номер прицепа
     * 
     * @param trailerStateSignID
     */
    public void setTrailerStateSignID(String trailerStateSignID) {
        this.trailerStateSignID = trailerStateSignID;
    }
}
