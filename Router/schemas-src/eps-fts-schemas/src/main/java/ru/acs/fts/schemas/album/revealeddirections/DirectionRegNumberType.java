
package ru.acs.fts.schemas.album.revealeddirections;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDID5Type;

/** 
 * ��������������� ����� ����������� ������������
 */
public class DirectionRegNumberType extends GTDID5Type
{
    private String seqNumberVersion;

    /** 
     * Get the 'SeqNumberVersion' element value. ���������� ����� ������ ����������� ������������
     * 
     * @return value
     */
    public String getSeqNumberVersion() {
        return seqNumberVersion;
    }

    /** 
     * Set the 'SeqNumberVersion' element value. ���������� ����� ������ ����������� ������������
     * 
     * @param seqNumberVersion
     */
    public void setSeqNumberVersion(String seqNumberVersion) {
        this.seqNumberVersion = seqNumberVersion;
    }
}
