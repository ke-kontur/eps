
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Комплексный тип для описания подробностей для автомобильного транспорта
 */
public class AvtoParticularsType
{
    private String trailerIdentifier;
    private String secondTrailerIdentifier;

    /** 
     * Get the 'TrailerIdentifier' element value. Идентификатор (номер) прицепного транспортного средства
     * 
     * @return value
     */
    public String getTrailerIdentifier() {
        return trailerIdentifier;
    }

    /** 
     * Set the 'TrailerIdentifier' element value. Идентификатор (номер) прицепного транспортного средства
     * 
     * @param trailerIdentifier
     */
    public void setTrailerIdentifier(String trailerIdentifier) {
        this.trailerIdentifier = trailerIdentifier;
    }

    /** 
     * Get the 'SecondTrailerIdentifier' element value. Идентификатор (номер) второго прицепного транспортного средства
     * 
     * @return value
     */
    public String getSecondTrailerIdentifier() {
        return secondTrailerIdentifier;
    }

    /** 
     * Set the 'SecondTrailerIdentifier' element value. Идентификатор (номер) второго прицепного транспортного средства
     * 
     * @param secondTrailerIdentifier
     */
    public void setSecondTrailerIdentifier(String secondTrailerIdentifier) {
        this.secondTrailerIdentifier = secondTrailerIdentifier;
    }
}
