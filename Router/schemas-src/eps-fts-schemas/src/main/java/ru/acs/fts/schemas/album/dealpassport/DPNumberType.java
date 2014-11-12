
package ru.acs.fts.schemas.album.dealpassport;

import org.joda.time.LocalDate;

/** 
 * ����� �������� ������
 */
public class DPNumberType
{
    private String part1;
    private String part2;
    private String part3;
    private String part4;
    private String part5;
    private LocalDate issueDate;

    /** 
     * Get the 'Part1' element value. ����� �� - ����� 1. 2 ����� - ��� ��������� ����� ����, � ������� �������� ��, 2 ����� - ����� ������ � ������� �������� ��, 4 ����� - ���������� ����� ������������ ������ �� � ������� ������������ ������ �� ���� ���������, ��� �������� ������ � ������� ����� ������ ��.
     * 
     * @return value
     */
    public String getPart1() {
        return part1;
    }

    /** 
     * Set the 'Part1' element value. ����� �� - ����� 1. 2 ����� - ��� ��������� ����� ����, � ������� �������� ��, 2 ����� - ����� ������ � ������� �������� ��, 4 ����� - ���������� ����� ������������ ������ �� � ������� ������������ ������ �� ���� ���������, ��� �������� ������ � ������� ����� ������ ��.
     * 
     * @param part1
     */
    public void setPart1(String part1) {
        this.part1 = part1;
    }

    /** 
     * Get the 'Part2' element value. ����� �� - ����� 2. ��������������� ����� �����.
     * 
     * @return value
     */
    public String getPart2() {
        return part2;
    }

    /** 
     * Set the 'Part2' element value. ����� �� - ����� 2. ��������������� ����� �����.
     * 
     * @param part2
     */
    public void setPart2(String part2) {
        this.part2 = part2;
    }

    /** 
     * Get the 'Part3' element value. ����� �� - ����� 3. ��������������� ����� ������� �����. ��� ���������� ������� ������������ "0000".
     * 
     * @return value
     */
    public String getPart3() {
        return part3;
    }

    /** 
     * Set the 'Part3' element value. ����� �� - ����� 3. ��������������� ����� ������� �����. ��� ���������� ������� ������������ "0000".
     * 
     * @param part3
     */
    public void setPart3(String part3) {
        this.part3 = part3;
    }

    /** 
     * Get the 'Part4' element value. ����� �� - ����� 4. ��� ��������� (���������� ��������) - �������� ���������� �� �� �� 15.06.2004 �.  N 117-�.
     * 
     * @return value
     */
    public String getPart4() {
        return part4;
    }

    /** 
     * Set the 'Part4' element value. ����� �� - ����� 4. ��� ��������� (���������� ��������) - �������� ���������� �� �� �� 15.06.2004 �.  N 117-�.
     * 
     * @param part4
     */
    public void setPart4(String part4) {
        this.part4 = part4;
    }

    /** 
     * Get the 'Part5' element value. ����� �� - ����� 5.
     * 
     * @return value
     */
    public String getPart5() {
        return part5;
    }

    /** 
     * Set the 'Part5' element value. ����� �� - ����� 5.
     * 
     * @param part5
     */
    public void setPart5(String part5) {
        this.part5 = part5;
    }

    /** 
     * Get the 'IssueDate' element value. ���� ���������� �������� ������ ������������� ����� �����
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. ���� ���������� �������� ������ ������������� ����� �����
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
}
