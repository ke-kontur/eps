
package ru.acs.fts.schemas.album.rospriroddangerouswaste;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Опасный отход, на транзит которого выдано разрешение
 */
public class ObjectType
{
    private List<String> nameList = new ArrayList<String>();
    private String TNVED;
    private String FKKO;
    private String exportCountry;
    private String importCountry;
    private String numeric;
    private SupplementaryQuantityType count;
    private DocumentBaseType contract;

    /** 
     * Get the list of 'Name' element items. Наименование отходов
     * 
     * @return list
     */
    public List<String> getNameList() {
        return nameList;
    }

    /** 
     * Set the list of 'Name' element items. Наименование отходов
     * 
     * @param list
     */
    public void setNameList(List<String> list) {
        nameList = list;
    }

    /** 
     * Get the 'TNVED' element value. Код ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. Код ТН ВЭД ТС
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the 'FKKO' element value. Код ФККО
     * 
     * @return value
     */
    public String getFKKO() {
        return FKKO;
    }

    /** 
     * Set the 'FKKO' element value. Код ФККО
     * 
     * @param FKKO
     */
    public void setFKKO(String FKKO) {
        this.FKKO = FKKO;
    }

    /** 
     * Get the 'ExportCountry' element value. Государство-экспорт
     * 
     * @return value
     */
    public String getExportCountry() {
        return exportCountry;
    }

    /** 
     * Set the 'ExportCountry' element value. Государство-экспорт
     * 
     * @param exportCountry
     */
    public void setExportCountry(String exportCountry) {
        this.exportCountry = exportCountry;
    }

    /** 
     * Get the 'ImportCountry' element value. Государство-импорт
     * 
     * @return value
     */
    public String getImportCountry() {
        return importCountry;
    }

    /** 
     * Set the 'ImportCountry' element value. Государство-импорт
     * 
     * @param importCountry
     */
    public void setImportCountry(String importCountry) {
        this.importCountry = importCountry;
    }

    /** 
     * Get the 'Numeric' element value. Номер позиции
     * 
     * @return value
     */
    public String getNumeric() {
        return numeric;
    }

    /** 
     * Set the 'Numeric' element value. Номер позиции
     * 
     * @param numeric
     */
    public void setNumeric(String numeric) {
        this.numeric = numeric;
    }

    /** 
     * Get the 'Count' element value. Количество
     * 
     * @return value
     */
    public SupplementaryQuantityType getCount() {
        return count;
    }

    /** 
     * Set the 'Count' element value. Количество
     * 
     * @param count
     */
    public void setCount(SupplementaryQuantityType count) {
        this.count = count;
    }

    /** 
     * Get the 'Contract' element value. Реквизиты контракта
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Реквизиты контракта
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }
}
