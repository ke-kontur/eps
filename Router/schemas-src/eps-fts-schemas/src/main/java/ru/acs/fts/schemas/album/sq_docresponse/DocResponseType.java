
package ru.acs.fts.schemas.album.sq_docresponse;

/** 
 * Запрошенный документ
 */
public class DocResponseType
{
    private String nameAuthority;
    private String searchResult;
    private String resultDescription;
    private DocResponseBodyType docResponseBody;

    /** 
     * Get the 'NameAuthority' element value. Наименование ФОИВ
     * 
     * @return value
     */
    public String getNameAuthority() {
        return nameAuthority;
    }

    /** 
     * Set the 'NameAuthority' element value. Наименование ФОИВ
     * 
     * @param nameAuthority
     */
    public void setNameAuthority(String nameAuthority) {
        this.nameAuthority = nameAuthority;
    }

    /** 
     * Get the 'SearchResult' element value. Признак наличия запрашиваемого документа по результатам поиска
     * 
     * @return value
     */
    public String getSearchResult() {
        return searchResult;
    }

    /** 
     * Set the 'SearchResult' element value. Признак наличия запрашиваемого документа по результатам поиска
     * 
     * @param searchResult
     */
    public void setSearchResult(String searchResult) {
        this.searchResult = searchResult;
    }

    /** 
     * Get the 'ResultDescription' element value. Описание результата поиска
     * 
     * @return value
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /** 
     * Set the 'ResultDescription' element value. Описание результата поиска
     * 
     * @param resultDescription
     */
    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    /** 
     * Get the 'DocResponseBody' element value. Тело запрошенного документа
     * 
     * @return value
     */
    public DocResponseBodyType getDocResponseBody() {
        return docResponseBody;
    }

    /** 
     * Set the 'DocResponseBody' element value. Тело запрошенного документа
     * 
     * @param docResponseBody
     */
    public void setDocResponseBody(DocResponseBodyType docResponseBody) {
        this.docResponseBody = docResponseBody;
    }
}
