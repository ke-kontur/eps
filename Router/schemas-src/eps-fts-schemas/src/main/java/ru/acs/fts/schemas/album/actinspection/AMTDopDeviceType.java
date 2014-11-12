
package ru.acs.fts.schemas.album.actinspection;

/** 
 * Дополнительное оборудование в тягаче
 */
public class AMTDopDeviceType
{
    private String cabCowl;
    private String ABS;
    private String conditioner;
    private String signalization;
    private String videotapeRecorder;
    private String audioSystem;
    private String TV;
    private String telefon;
    private String fax;
    private String fridge;
    private String microvawe;
    private String navigationSystem;
    private String pressRegulationSystem;

    /** 
     * Get the 'CabCowl' element value. Надкабинный обтекатель: "0" - нет, "1" - нерегулируемый по высоте, "2" - регулируемый по высоте
     * 
     * @return value
     */
    public String getCabCowl() {
        return cabCowl;
    }

    /** 
     * Set the 'CabCowl' element value. Надкабинный обтекатель: "0" - нет, "1" - нерегулируемый по высоте, "2" - регулируемый по высоте
     * 
     * @param cabCowl
     */
    public void setCabCowl(String cabCowl) {
        this.cabCowl = cabCowl;
    }

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
     * Get the 'Signalization' element value. Сигнализация: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getSignalization() {
        return signalization;
    }

    /** 
     * Set the 'Signalization' element value. Сигнализация: "0" - нет, "1" - есть
     * 
     * @param signalization
     */
    public void setSignalization(String signalization) {
        this.signalization = signalization;
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

    /** 
     * Get the 'PressRegulationSystem' element value. Система автоматического регулирования давления в шинах: "0" - нет, "1" - есть
     * 
     * @return value
     */
    public String getPressRegulationSystem() {
        return pressRegulationSystem;
    }

    /** 
     * Set the 'PressRegulationSystem' element value. Система автоматического регулирования давления в шинах: "0" - нет, "1" - есть
     * 
     * @param pressRegulationSystem
     */
    public void setPressRegulationSystem(String pressRegulationSystem) {
        this.pressRegulationSystem = pressRegulationSystem;
    }
}
