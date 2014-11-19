
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * Ќомер контейнера
 */
public class ContainerNumberType
{
    private String containerIdentificaror;
    private String fullIndicator;

    /** 
     * Get the 'ContainerIdentificaror' element value. Ќомер (идентификатор) контейнера
     * 
     * @return value
     */
    public String getContainerIdentificaror() {
        return containerIdentificaror;
    }

    /** 
     * Set the 'ContainerIdentificaror' element value. Ќомер (идентификатор) контейнера
     * 
     * @param containerIdentificaror
     */
    public void setContainerIdentificaror(String containerIdentificaror) {
        this.containerIdentificaror = containerIdentificaror;
    }

    /** 
     * Get the 'FullIndicator' element value. ѕризнак заполнени€ контейнера. 1 - товар занимает весь контейнер  2- товар занимает часть контейнера
     * 
     * @return value
     */
    public String getFullIndicator() {
        return fullIndicator;
    }

    /** 
     * Set the 'FullIndicator' element value. ѕризнак заполнени€ контейнера. 1 - товар занимает весь контейнер  2- товар занимает часть контейнера
     * 
     * @param fullIndicator
     */
    public void setFullIndicator(String fullIndicator) {
        this.fullIndicator = fullIndicator;
    }
}
