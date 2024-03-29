
package ru.acs.fts.schemas.album.gtdreference;

/** 
 * ������ �.�������� � �������
 */
public class BSideDealInfoType
{
    private OrgDealInfoType seller;
    private OrgDealInfoType buyer;

    /** 
     * Get the 'Seller' element value. ��������, ���������� �����������-��������
     * 
     * @return value
     */
    public OrgDealInfoType getSeller() {
        return seller;
    }

    /** 
     * Set the 'Seller' element value. ��������, ���������� �����������-��������
     * 
     * @param seller
     */
    public void setSeller(OrgDealInfoType seller) {
        this.seller = seller;
    }

    /** 
     * Get the 'Buyer' element value. ��������, ���������� �����������-����������
     * 
     * @return value
     */
    public OrgDealInfoType getBuyer() {
        return buyer;
    }

    /** 
     * Set the 'Buyer' element value. ��������, ���������� �����������-����������
     * 
     * @param buyer
     */
    public void setBuyer(OrgDealInfoType buyer) {
        this.buyer = buyer;
    }
}
