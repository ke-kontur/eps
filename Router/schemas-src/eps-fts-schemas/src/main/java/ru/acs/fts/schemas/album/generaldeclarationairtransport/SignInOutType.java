
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

/** 
 * ������� ���������� �������������, ����������� (�����������) ������� ���������� ����� �� ���������� �� � �� ��� ����� ����������� ������, ���������� ��������� (��������) ��� �������� � ����� �������
 */
public class SignInOutType
{
    private String landingSign;
    private String goodSign;

    /** 
     * Get the 'LandingSign' element value. ������� � ���������� �������������, ����������� (�����������) ������� ���������� ����� �� ���������� ��.
     * 
     * @return value
     */
    public String getLandingSign() {
        return landingSign;
    }

    /** 
     * Set the 'LandingSign' element value. ������� � ���������� �������������, ����������� (�����������) ������� ���������� ����� �� ���������� ��.
     * 
     * @param landingSign
     */
    public void setLandingSign(String landingSign) {
        this.landingSign = landingSign;
    }

    /** 
     * Get the 'GoodSign' element value. �� ����� ���������� ����� ����������� ������, ���������� ��������� (��������) ��� �������� � ����� �������
     * 
     * @return value
     */
    public String getGoodSign() {
        return goodSign;
    }

    /** 
     * Set the 'GoodSign' element value. �� ����� ���������� ����� ����������� ������, ���������� ��������� (��������) ��� �������� � ����� �������
     * 
     * @param goodSign
     */
    public void setGoodSign(String goodSign) {
        this.goodSign = goodSign;
    }
}
