
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * Подвеска колес
 */
public class PodveskaType
{
    private String frontSuspension;
    private List<String> rearSuspensionList = new ArrayList<String>();

    /** 
     * Get the 'FrontSuspension' element value. Тип передней подвески оси: "1" - рессорная, "2" - пневматическая, "3" - торсионная
     * 
     * @return value
     */
    public String getFrontSuspension() {
        return frontSuspension;
    }

    /** 
     * Set the 'FrontSuspension' element value. Тип передней подвески оси: "1" - рессорная, "2" - пневматическая, "3" - торсионная
     * 
     * @param frontSuspension
     */
    public void setFrontSuspension(String frontSuspension) {
        this.frontSuspension = frontSuspension;
    }

    /** 
     * Get the list of 'RearSuspension' element items. Тип задней подвески оси: "1" - рессорная, "2" - пневматическая, "3" - торсионная
     * 
     * @return list
     */
    public List<String> getRearSuspensionList() {
        return rearSuspensionList;
    }

    /** 
     * Set the list of 'RearSuspension' element items. Тип задней подвески оси: "1" - рессорная, "2" - пневматическая, "3" - торсионная
     * 
     * @param list
     */
    public void setRearSuspensionList(List<String> list) {
        rearSuspensionList = list;
    }
}
