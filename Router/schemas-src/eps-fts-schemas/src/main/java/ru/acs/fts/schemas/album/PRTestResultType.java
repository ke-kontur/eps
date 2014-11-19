
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ���������� ������������ ��/���/���/����
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:CustomsDocuments:PRTestResult:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PRTestResultType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="TestID"/>
 *         &lt;xs:element name="TestPeriodResult" maxOccurs="unbounded">
 *           &lt;!-- Reference to inner class TestPeriodResult -->
 *         &lt;/xs:element>
 *         &lt;xs:element name="AverageTestResult">
 *           &lt;xs:complexType>
 *             &lt;xs:sequence>
 *               &lt;xs:element type="xs:string" name="TotalDT"/>
 *               &lt;xs:element type="xs:string" name="TotalRiskDT"/>
 *             &lt;/xs:sequence>
 *           &lt;/xs:complexType>
 *         &lt;/xs:element>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="R102001E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PRTestResultType extends BaseDocType
{
    private String testID;
    private List<TestPeriodResult> testPeriodResultList = new ArrayList<TestPeriodResult>();
    private String averageTestResultTotalDT;
    private String averageTestResultTotalRiskDT;
    private String documentModeID;

    /** 
     * Get the 'TestID' element value. ���������� ������������� �����
     * 
     * @return value
     */
    public String getTestID() {
        return testID;
    }

    /** 
     * Set the 'TestID' element value. ���������� ������������� �����
     * 
     * @param testID
     */
    public void setTestID(String testID) {
        this.testID = testID;
    }

    /** 
     * Get the list of 'TestPeriodResult' element items.
     * 
     * @return list
     */
    public List<TestPeriodResult> getTestPeriodResultList() {
        return testPeriodResultList;
    }

    /** 
     * Set the list of 'TestPeriodResult' element items.
     * 
     * @param list
     */
    public void setTestPeriodResultList(List<TestPeriodResult> list) {
        testPeriodResultList = list;
    }

    /** 
     * Get the 'TotalDT' element value. ������� ���������� ��, ������������ � �������� ������������ �� ���� ��������
     * 
     * @return value
     */
    public String getAverageTestResultTotalDT() {
        return averageTestResultTotalDT;
    }

    /** 
     * Set the 'TotalDT' element value. ������� ���������� ��, ������������ � �������� ������������ �� ���� ��������
     * 
     * @param averageTestResultTotalDT
     */
    public void setAverageTestResultTotalDT(String averageTestResultTotalDT) {
        this.averageTestResultTotalDT = averageTestResultTotalDT;
    }

    /** 
     * Get the 'TotalRiskDT' element value. ������� ���������� ��, �� ������� ��� ������� ���� � �������� ������������ �� ���� ��������
     * 
     * @return value
     */
    public String getAverageTestResultTotalRiskDT() {
        return averageTestResultTotalRiskDT;
    }

    /** 
     * Set the 'TotalRiskDT' element value. ������� ���������� ��, �� ������� ��� ������� ���� � �������� ������������ �� ���� ��������
     * 
     * @param averageTestResultTotalRiskDT
     */
    public void setAverageTestResultTotalRiskDT(
            String averageTestResultTotalRiskDT) {
        this.averageTestResultTotalRiskDT = averageTestResultTotalRiskDT;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� � ������� �������� ��� ��)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� � ������� �������� ��� ��)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
    /** 
     * ���������� ������������ �� ������
     * 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:PRTestResult:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TestPeriodResult" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:date" name="TestStart"/>
     *       &lt;xs:element type="xs:date" name="TestEnd"/>
     *       &lt;xs:element type="xs:string" name="TotalDT"/>
     *       &lt;xs:element type="xs:string" name="TotalRiskDT"/>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class TestPeriodResult
    {
        private LocalDate testStart;
        private LocalDate testEnd;
        private String totalDT;
        private String totalRiskDT;

        /** 
         * Get the 'TestStart' element value. ���� ������ ������� ������������, ������������� ���� ����������� ��
         * 
         * @return value
         */
        public LocalDate getTestStart() {
            return testStart;
        }

        /** 
         * Set the 'TestStart' element value. ���� ������ ������� ������������, ������������� ���� ����������� ��
         * 
         * @param testStart
         */
        public void setTestStart(LocalDate testStart) {
            this.testStart = testStart;
        }

        /** 
         * Get the 'TestEnd' element value. ���� ��������� ������� ������������, ������������� ���� ����������� ��
         * 
         * @return value
         */
        public LocalDate getTestEnd() {
            return testEnd;
        }

        /** 
         * Set the 'TestEnd' element value. ���� ��������� ������� ������������, ������������� ���� ����������� ��
         * 
         * @param testEnd
         */
        public void setTestEnd(LocalDate testEnd) {
            this.testEnd = testEnd;
        }

        /** 
         * Get the 'TotalDT' element value. ����� ���������� �� �� ������, ������������ � �������� ������������
         * 
         * @return value
         */
        public String getTotalDT() {
            return totalDT;
        }

        /** 
         * Set the 'TotalDT' element value. ����� ���������� �� �� ������, ������������ � �������� ������������
         * 
         * @param totalDT
         */
        public void setTotalDT(String totalDT) {
            this.totalDT = totalDT;
        }

        /** 
         * Get the 'TotalRiskDT' element value. ����� ���������� �� �� ������, �� ������� ��� ������� ���� � �������� ������������
         * 
         * @return value
         */
        public String getTotalRiskDT() {
            return totalRiskDT;
        }

        /** 
         * Set the 'TotalRiskDT' element value. ����� ���������� �� �� ������, �� ������� ��� ������� ���� � �������� ������������
         * 
         * @param totalRiskDT
         */
        public void setTotalRiskDT(String totalRiskDT) {
            this.totalRiskDT = totalRiskDT;
        }
    }
}
