
package ru.acs.fts.schemas.album.sq_docresponse;

/** 
 * ����������� ��������
 */
public class DocResponseType
{
    private String nameAuthority;
    private String searchResult;
    private String resultDescription;
    private DocResponseBodyType docResponseBody;

    /** 
     * Get the 'NameAuthority' element value. ������������ ����
     * 
     * @return value
     */
    public String getNameAuthority() {
        return nameAuthority;
    }

    /** 
     * Set the 'NameAuthority' element value. ������������ ����
     * 
     * @param nameAuthority
     */
    public void setNameAuthority(String nameAuthority) {
        this.nameAuthority = nameAuthority;
    }

    /** 
     * Get the 'SearchResult' element value. ������� ������� �������������� ��������� �� ����������� ������
     * 
     * @return value
     */
    public String getSearchResult() {
        return searchResult;
    }

    /** 
     * Set the 'SearchResult' element value. ������� ������� �������������� ��������� �� ����������� ������
     * 
     * @param searchResult
     */
    public void setSearchResult(String searchResult) {
        this.searchResult = searchResult;
    }

    /** 
     * Get the 'ResultDescription' element value. �������� ���������� ������
     * 
     * @return value
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /** 
     * Set the 'ResultDescription' element value. �������� ���������� ������
     * 
     * @param resultDescription
     */
    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    /** 
     * Get the 'DocResponseBody' element value. ���� ������������ ���������
     * 
     * @return value
     */
    public DocResponseBodyType getDocResponseBody() {
        return docResponseBody;
    }

    /** 
     * Set the 'DocResponseBody' element value. ���� ������������ ���������
     * 
     * @param docResponseBody
     */
    public void setDocResponseBody(DocResponseBodyType docResponseBody) {
        this.docResponseBody = docResponseBody;
    }
}
