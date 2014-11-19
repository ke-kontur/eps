
package ru.acs.fts.schemas.album.eps_inforequest;

/** 
 * Запрос к процедуре/процессу
 */
public class ProcessRequestType
{
    private String processID;

    /** 
     * Get the 'ProcessID' element value. Идентификатор процесса
     * 
     * @return value
     */
    public String getProcessID() {
        return processID;
    }

    /** 
     * Set the 'ProcessID' element value. Идентификатор процесса
     * 
     * @param processID
     */
    public void setProcessID(String processID) {
        this.processID = processID;
    }
}
