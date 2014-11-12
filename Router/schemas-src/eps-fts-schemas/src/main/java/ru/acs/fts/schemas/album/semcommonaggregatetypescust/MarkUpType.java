
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

/** 
 * Разметка слова в тексте
 */
public class MarkUpType
{
    private String delimiter;
    private String word;
    private String weight;

    /** 
     * Get the 'Delimiter' element value. Разделитель, вставляется после Word. Может отсутствовать
     * 
     * @return value
     */
    public String getDelimiter() {
        return delimiter;
    }

    /** 
     * Set the 'Delimiter' element value. Разделитель, вставляется после Word. Может отсутствовать
     * 
     * @param delimiter
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /** 
     * Get the 'Word' element value. Подсвечиваемое слово
     * 
     * @return value
     */
    public String getWord() {
        return word;
    }

    /** 
     * Set the 'Word' element value. Подсвечиваемое слово
     * 
     * @param word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /** 
     * Get the 'Weight' element value. Значимость слова. Значение от 0 до 16. Влияет на силу выделения слова в общем размеченном тексте
     * 
     * @return value
     */
    public String getWeight() {
        return weight;
    }

    /** 
     * Set the 'Weight' element value. Значимость слова. Значение от 0 до 16. Влияет на силу выделения слова в общем размеченном тексте
     * 
     * @param weight
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }
}
