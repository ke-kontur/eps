
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о грузовых местах, и упаковке товаров
 */
public class GoodsPackagingType
{
    private String pakageQuantity;
    private String cargoCode;
    private String cargoDescription;
    private List<PackingInformationType> packingInformationList = new ArrayList<PackingInformationType>();

    /** 
     * Get the 'PakageQuantity' element value. Количество грузовых мест.
     * 
     * @return value
     */
    public String getPakageQuantity() {
        return pakageQuantity;
    }

    /** 
     * Set the 'PakageQuantity' element value. Количество грузовых мест.
     * 
     * @param pakageQuantity
     */
    public void setPakageQuantity(String pakageQuantity) {
        this.pakageQuantity = pakageQuantity;
    }

    /** 
     * Get the 'CargoCode' element value. Код вида груза в соответствии с  классификатором видов груза, упаковки и упаковочных материалов.
     * 
     * @return value
     */
    public String getCargoCode() {
        return cargoCode;
    }

    /** 
     * Set the 'CargoCode' element value. Код вида груза в соответствии с  классификатором видов груза, упаковки и упаковочных материалов.
     * 
     * @param cargoCode
     */
    public void setCargoCode(String cargoCode) {
        this.cargoCode = cargoCode;
    }

    /** 
     * Get the 'CargoDescription' element value. Описание вида груза.
     * 
     * @return value
     */
    public String getCargoDescription() {
        return cargoDescription;
    }

    /** 
     * Set the 'CargoDescription' element value. Описание вида груза.
     * 
     * @param cargoDescription
     */
    public void setCargoDescription(String cargoDescription) {
        this.cargoDescription = cargoDescription;
    }

    /** 
     * Get the list of 'PackingInformation' element items. Сведения об упаковке товаров. Код, Количество. Маркировка
     * 
     * @return list
     */
    public List<PackingInformationType> getPackingInformationList() {
        return packingInformationList;
    }

    /** 
     * Set the list of 'PackingInformation' element items. Сведения об упаковке товаров. Код, Количество. Маркировка
     * 
     * @param list
     */
    public void setPackingInformationList(List<PackingInformationType> list) {
        packingInformationList = list;
    }
}
