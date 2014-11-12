
package ru.acs.fts.schemas.album.actinspection;

/** 
 * Дополнительное оборудование в автобусе
 */
public class BusDopDeviceType
{
    private String ABS;
    private String conditioner;
    private String videotapeRecorder;
    private String audioSystem;
    private String TV;
    private String telefon;
    private String fax;
    private String bioCloset;
    private String fridge;
    private String microvawe;
    private String navigationSystem;

    /** 
     * Get the 'ABS' element value. Антиблокировочная система: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getABS() {
        return ABS;
    }

    /** 
     * Set the 'ABS' element value. Антиблокировочная система: "0" - нет, "1" - есть
     * 
     * @param ABS
     */
    public void setABS(String ABS) {
        this.ABS = ABS;
    }

    /** 
     * Get the 'Conditioner' element value. Кондиционер: "0" - нет, "1" - кондиционер, "2" - климат контроль
     * 
     * @return value
     */
    public String getConditioner() {
        return conditioner;
    }

    /** 
     * Set the 'Conditioner' element value. Кондиционер: "0" - нет, "1" - кондиционер, "2" - климат контроль
     * 
     * @param conditioner
     */
    public void setConditioner(String conditioner) {
        this.conditioner = conditioner;
    }

    /** 
     * Get the 'VideotapeRecorder' element value. Видеомагнитофон: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getVideotapeRecorder() {
        return videotapeRecorder;
    }

    /** 
     * Set the 'VideotapeRecorder' element value. Видеомагнитофон: "0" - нет, "1" - есть
     * 
     * @param videotapeRecorder
     */
    public void setVideotapeRecorder(String videotapeRecorder) {
        this.videotapeRecorder = videotapeRecorder;
    }

    /** 
     * Get the 'AudioSystem' element value. Аудиосистема: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getAudioSystem() {
        return audioSystem;
    }

    /** 
     * Set the 'AudioSystem' element value. Аудиосистема: "0" - нет, "1" - есть
     * 
     * @param audioSystem
     */
    public void setAudioSystem(String audioSystem) {
        this.audioSystem = audioSystem;
    }

    /** 
     * Get the 'TV' element value. Телевизор: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getTV() {
        return TV;
    }

    /** 
     * Set the 'TV' element value. Телевизор: "0" - нет, "1" - есть
     * 
     * @param TV
     */
    public void setTV(String TV) {
        this.TV = TV;
    }

    /** 
     * Get the 'Telefon' element value. Количество телефонов: "0" - если нет
     * 
     * @return value
     */
    public String getTelefon() {
        return telefon;
    }

    /** 
     * Set the 'Telefon' element value. Количество телефонов: "0" - если нет
     * 
     * @param telefon
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /** 
     * Get the 'Fax' element value. Факс: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getFax() {
        return fax;
    }

    /** 
     * Set the 'Fax' element value. Факс: "0" - нет, "1" - есть
     * 
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /** 
     * Get the 'BioCloset' element value. Биотуалет: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getBioCloset() {
        return bioCloset;
    }

    /** 
     * Set the 'BioCloset' element value. Биотуалет: "0" - нет, "1" - есть
     * 
     * @param bioCloset
     */
    public void setBioCloset(String bioCloset) {
        this.bioCloset = bioCloset;
    }

    /** 
     * Get the 'Fridge' element value. Холодильник: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getFridge() {
        return fridge;
    }

    /** 
     * Set the 'Fridge' element value. Холодильник: "0" - нет, "1" - есть
     * 
     * @param fridge
     */
    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    /** 
     * Get the 'Microvawe' element value. Печь СВЧ: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getMicrovawe() {
        return microvawe;
    }

    /** 
     * Set the 'Microvawe' element value. Печь СВЧ: "0" - нет, "1" - есть
     * 
     * @param microvawe
     */
    public void setMicrovawe(String microvawe) {
        this.microvawe = microvawe;
    }

    /** 
     * Get the 'NavigationSystem' element value. Навигационная система: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getNavigationSystem() {
        return navigationSystem;
    }

    /** 
     * Set the 'NavigationSystem' element value. Навигационная система: "0" - нет, "1" - есть
     * 
     * @param navigationSystem
     */
    public void setNavigationSystem(String navigationSystem) {
        this.navigationSystem = navigationSystem;
    }
}
