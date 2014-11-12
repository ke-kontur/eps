
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Сведения о компоненте функционального блока
 */
public class MechUnitPartType extends ComponentDescriptionType
{
    private String partDescription;

    /** 
     * Get the 'PartDescription' element value. Наименование компоненты
     * 
     * @return value
     */
    public String getPartDescription() {
        return partDescription;
    }

    /** 
     * Set the 'PartDescription' element value. Наименование компоненты
     * 
     * @param partDescription
     */
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
}
