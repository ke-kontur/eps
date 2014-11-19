
package ru.acs.fts.schemas.album.freedoc;

import java.math.BigInteger;

/** 
 * ������ �������
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
     * Get the 'align' attribute value. ����� ������������ �� �����������
     * 
     * @return value
     */
    public AlignType getAlign() {
        return align;
    }

    /** 
     * Set the 'align' attribute value. ����� ������������ �� �����������
     * 
     * @param align
     */
    public void setAlign(AlignType align) {
        this.align = align;
    }

    /** 
     * Get the 'valign' attribute value. ����� ������������ �� ���������
     * 
     * @return value
     */
    public ValignType getValign() {
        return valign;
    }

    /** 
     * Set the 'valign' attribute value. ����� ������������ �� ���������
     * 
     * @param valign
     */
    public void setValign(ValignType valign) {
        this.valign = valign;
    }

    /** 
     * Get the 'namest' attribute value. ������������ ������ ������ ���������� � ����������� �� �����������
     * 
     * @return value
     */
    public String getNamest() {
        return namest;
    }

    /** 
     * Set the 'namest' attribute value. ������������ ������ ������ ���������� � ����������� �� �����������
     * 
     * @param namest
     */
    public void setNamest(String namest) {
        this.namest = namest;
    }

    /** 
     * Get the 'nameend' attribute value. ������������ ��������� ������ ���������� � ����������� �� �����������
     * 
     * @return value
     */
    public String getNameend() {
        return nameend;
    }

    /** 
     * Set the 'nameend' attribute value. ������������ ��������� ������ ���������� � ����������� �� �����������
     * 
     * @param nameend
     */
    public void setNameend(String nameend) {
        this.nameend = nameend;
    }

    /** 
     * Get the 'morerows' attribute value. ���������� �����, ���������� � ����������� �� ���������
     * 
     * @return value
     */
    public BigInteger getMorerows() {
        return morerows;
    }

    /** 
     * Set the 'morerows' attribute value. ���������� �����, ���������� � ����������� �� ���������
     * 
     * @param morerows
     */
    public void setMorerows(BigInteger morerows) {
        this.morerows = morerows;
    }

    /** 
     * Get the 'morecols' attribute value. ���������� ��������, ���������� � ����������� �� �����������
     * 
     * @return value
     */
    public BigInteger getMorecols() {
        return morecols;
    }

    /** 
     * Set the 'morecols' attribute value. ���������� ��������, ���������� � ����������� �� �����������
     * 
     * @param morecols
     */
    public void setMorecols(BigInteger morecols) {
        this.morecols = morecols;
    }
}
