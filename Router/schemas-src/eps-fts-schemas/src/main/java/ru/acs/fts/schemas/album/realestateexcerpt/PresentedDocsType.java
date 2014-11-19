
package ru.acs.fts.schemas.album.realestateexcerpt;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * Представленные документы
 */
public class PresentedDocsType extends IdentityCardType
{
    private String register;
    private String note;
    private LocalDate startDate;
    private LocalDate endDate;
    private String imageFile;
    private String imageReference;
    private LocalDate regDate;
    private String regNum;
    private String appendFileType;
    private String appendFileName;
    private List<QuantityType> quantityList = new ArrayList<QuantityType>();

    /** 
     * Get the 'Register' element value. Регистратор (ФИО нотариуса)
     * 
     * @return value
     */
    public String getRegister() {
        return register;
    }

    /** 
     * Set the 'Register' element value. Регистратор (ФИО нотариуса)
     * 
     * @param register
     */
    public void setRegister(String register) {
        this.register = register;
    }

    /** 
     * Get the 'Note' element value. Особые отметки
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. Особые отметки
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /** 
     * Get the 'StartDate' element value. Дата начала действия
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. Дата начала действия
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата прекращения действия
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата прекращения действия
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'ImageFile' element value. Имя файла с изображением
     * 
     * @return value
     */
    public String getImageFile() {
        return imageFile;
    }

    /** 
     * Set the 'ImageFile' element value. Имя файла с изображением
     * 
     * @param imageFile
     */
    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    /** 
     * Get the 'ImageReference' element value. Электронный адрес изображения
     * 
     * @return value
     */
    public String getImageReference() {
        return imageReference;
    }

    /** 
     * Set the 'ImageReference' element value. Электронный адрес изображения
     * 
     * @param imageReference
     */
    public void setImageReference(String imageReference) {
        this.imageReference = imageReference;
    }

    /** 
     * Get the 'RegDate' element value. Дата государственной регистрации
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. Дата государственной регистрации
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'RegNum' element value. Номер регистрации
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. Номер регистрации
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /** 
     * Get the 'AppendFileType' element value. Тип  приложенного файла по классификатору
     * 
     * @return value
     */
    public String getAppendFileType() {
        return appendFileType;
    }

    /** 
     * Set the 'AppendFileType' element value. Тип  приложенного файла по классификатору
     * 
     * @param appendFileType
     */
    public void setAppendFileType(String appendFileType) {
        this.appendFileType = appendFileType;
    }

    /** 
     * Get the 'AppendFileName' element value. Имя приложенного файла
     * 
     * @return value
     */
    public String getAppendFileName() {
        return appendFileName;
    }

    /** 
     * Set the 'AppendFileName' element value. Имя приложенного файла
     * 
     * @param appendFileName
     */
    public void setAppendFileName(String appendFileName) {
        this.appendFileName = appendFileName;
    }

    /** 
     * Get the list of 'Quantity' element items. Количество
     * 
     * @return list
     */
    public List<QuantityType> getQuantityList() {
        return quantityList;
    }

    /** 
     * Set the list of 'Quantity' element items. Количество
     * 
     * @param list
     */
    public void setQuantityList(List<QuantityType> list) {
        quantityList = list;
    }
}
