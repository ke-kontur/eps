
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * Сведения указываемые при перемещении припасов
 */
public class StoreTransferDocType
{
    private String transferImportCode;
    private String transferExportCode;

    /** 
     * Get the 'TransferImportCode' element value. Сведения, указываемые  при помещении товаров под таможенный режим перемещения припасов (ВВОЗ)  Цель перемещения припасов: 41 - ЭКСПЛУАТАЦИОННЫЕ ПРИПАСЫ  42 - ПОТРЕБИТЕЛЬСКИЕ ПРИПАСЫ 43 - ПРОДАВАЕМЫЕ ПРИПАСЫ.
     * 
     * @return value
     */
    public String getTransferImportCode() {
        return transferImportCode;
    }

    /** 
     * Set the 'TransferImportCode' element value. Сведения, указываемые  при помещении товаров под таможенный режим перемещения припасов (ВВОЗ)  Цель перемещения припасов: 41 - ЭКСПЛУАТАЦИОННЫЕ ПРИПАСЫ  42 - ПОТРЕБИТЕЛЬСКИЕ ПРИПАСЫ 43 - ПРОДАВАЕМЫЕ ПРИПАСЫ.
     * 
     * @param transferImportCode
     */
    public void setTransferImportCode(String transferImportCode) {
        this.transferImportCode = transferImportCode;
    }

    /** 
     * Get the 'TransferExportCode' element value. Сведения, указываемые при помещении товаров под таможенный режим перемещения припасов (ВЫВОЗ) Цель перемещения припасов:  41 - ЭКСПЛУАТАЦИОННЫЕ ПРИПАСЫ  42 - ПОТРЕБИТЕЛЬСКИЕ ПРИПАСЫ 43 - ПРОДАВАЕМЫЕ ПРИПАСЫ
     * 
     * @return value
     */
    public String getTransferExportCode() {
        return transferExportCode;
    }

    /** 
     * Set the 'TransferExportCode' element value. Сведения, указываемые при помещении товаров под таможенный режим перемещения припасов (ВЫВОЗ) Цель перемещения припасов:  41 - ЭКСПЛУАТАЦИОННЫЕ ПРИПАСЫ  42 - ПОТРЕБИТЕЛЬСКИЕ ПРИПАСЫ 43 - ПРОДАВАЕМЫЕ ПРИПАСЫ
     * 
     * @param transferExportCode
     */
    public void setTransferExportCode(String transferExportCode) {
        this.transferExportCode = transferExportCode;
    }
}
