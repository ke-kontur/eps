
package ru.acs.fts.schemas.album.transitrevealedrisks;

/** 
 * Ссылки на ПР/СПР, которые сработали на ТС в целом (т.е. на все партии товаров)
 */
public class ProfileRefType
{
    private String URI;

    /** 
     * Get the 'URI' attribute value. Указывается #ID
     * 
     * @return value
     */
    public String getURI() {
        return URI;
    }

    /** 
     * Set the 'URI' attribute value. Указывается #ID
     * 
     * @param URI
     */
    public void setURI(String URI) {
        this.URI = URI;
    }
}
