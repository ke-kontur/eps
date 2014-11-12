
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * ����������/��������
 */
public class BuyerSellerType
{
    private String buyer;
    private String seller;

    /** 
     * Get the 'Buyer' element value. ������� ����, ��� ������� �������� ���� ���������� �����������
     * 
     * @return value
     */
    public String getBuyer() {
        return buyer;
    }

    /** 
     * Set the 'Buyer' element value. ������� ����, ��� ������� �������� ���� ���������� �����������
     * 
     * @param buyer
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    /** 
     * Get the 'Seller' element value. ������� ����, ��� ������� �������� ���� ���������� ���������
     * 
     * @return value
     */
    public String getSeller() {
        return seller;
    }

    /** 
     * Set the 'Seller' element value. ������� ����, ��� ������� �������� ���� ���������� ���������
     * 
     * @param seller
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }
}
