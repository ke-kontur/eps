
package ru.acs.fts.schemas.album.freedoc;

import java.math.BigInteger;

/** 
 * Ячейка таблицы
 */
public class TableCellType extends TextParagrType
{
    private AlignType align;
    private ValignType valign;
    private String namest;
    private String nameend;
    private BigInteger morerows;
    private BigInteger morecols;

    /** 
     * Get the 'align' attribute value. Стили выравнивания по горизонтали
     * 
     * @return value
     */
    public AlignType getAlign() {
        return align;
    }

    /** 
     * Set the 'align' attribute value. Стили выравнивания по горизонтали
     * 
     * @param align
     */
    public void setAlign(AlignType align) {
        this.align = align;
    }

    /** 
     * Get the 'valign' attribute value. Стили выравнивания по вертикали
     * 
     * @return value
     */
    public ValignType getValign() {
        return valign;
    }

    /** 
     * Set the 'valign' attribute value. Стили выравнивания по вертикали
     * 
     * @param valign
     */
    public void setValign(ValignType valign) {
        this.valign = valign;
    }

    /** 
     * Get the 'namest' attribute value. Наименование первой ячейки включаемой в объединение по горизонтали
     * 
     * @return value
     */
    public String getNamest() {
        return namest;
    }

    /** 
     * Set the 'namest' attribute value. Наименование первой ячейки включаемой в объединение по горизонтали
     * 
     * @param namest
     */
    public void setNamest(String namest) {
        this.namest = namest;
    }

    /** 
     * Get the 'nameend' attribute value. Наименование последней ячейки включаемой в объединение по горизонтали
     * 
     * @return value
     */
    public String getNameend() {
        return nameend;
    }

    /** 
     * Set the 'nameend' attribute value. Наименование последней ячейки включаемой в объединение по горизонтали
     * 
     * @param nameend
     */
    public void setNameend(String nameend) {
        this.nameend = nameend;
    }

    /** 
     * Get the 'morerows' attribute value. Количество строк, включаемых в объединение по вертикали
     * 
     * @return value
     */
    public BigInteger getMorerows() {
        return morerows;
    }

    /** 
     * Set the 'morerows' attribute value. Количество строк, включаемых в объединение по вертикали
     * 
     * @param morerows
     */
    public void setMorerows(BigInteger morerows) {
        this.morerows = morerows;
    }

    /** 
     * Get the 'morecols' attribute value. Количество столбцов, включаемых в объединение по горизонтали
     * 
     * @return value
     */
    public BigInteger getMorecols() {
        return morecols;
    }

    /** 
     * Set the 'morecols' attribute value. Количество столбцов, включаемых в объединение по горизонтали
     * 
     * @param morecols
     */
    public void setMorecols(BigInteger morecols) {
        this.morecols = morecols;
    }
}
