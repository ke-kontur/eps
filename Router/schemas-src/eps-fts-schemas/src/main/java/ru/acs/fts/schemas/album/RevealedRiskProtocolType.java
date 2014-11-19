
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Протокол выявления профиля риска с детализацией
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RevealedRiskProtocolType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="RiskAtomicVersion" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="AlertedSign" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="DocumentNumber"/>
 *         &lt;xs:element name="RiskProfile" minOccurs="0" maxOccurs="unbounded">
 *           &lt;!-- Reference to inner class RiskProfile -->
 *         &lt;/xs:element>
 *         &lt;xs:element type="xs:string" name="BeginRevealing" minOccurs="0"/>
 *         &lt;xs:element type="xs:string" name="EndRevealing" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="R102002E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RevealedRiskProtocolType extends BaseDocType
{
    private String riskAtomicVersion;
    private String alertedSign;
    private String documentNumber;
    private List<RiskProfile> riskProfileList = new ArrayList<RiskProfile>();
    private String beginRevealing;
    private String endRevealing;
    private String documentModeID;

    /** 
     * Get the 'RiskAtomicVersion' element value. Версия файла атомарного модуля выявления
     * 
     * @return value
     */
    public String getRiskAtomicVersion() {
        return riskAtomicVersion;
    }

    /** 
     * Set the 'RiskAtomicVersion' element value. Версия файла атомарного модуля выявления
     * 
     * @param riskAtomicVersion
     */
    public void setRiskAtomicVersion(String riskAtomicVersion) {
        this.riskAtomicVersion = riskAtomicVersion;
    }

    /** 
     * Get the 'AlertedSign' element value. Признак попадания ДТ в список выявляемых для  АПС Тестирование (true - попала, false - не попала)
     * 
     * @return value
     */
    public String getAlertedSign() {
        return alertedSign;
    }

    /** 
     * Set the 'AlertedSign' element value. Признак попадания ДТ в список выявляемых для  АПС Тестирование (true - попала, false - не попала)
     * 
     * @param alertedSign
     */
    public void setAlertedSign(String alertedSign) {
        this.alertedSign = alertedSign;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер ДТ/ПП/ПИ/ТД
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер ДТ/ПП/ПИ/ТД
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the list of 'RiskProfile' element items.
     * 
     * @return list
     */
    public List<RiskProfile> getRiskProfileList() {
        return riskProfileList;
    }

    /** 
     * Set the list of 'RiskProfile' element items.
     * 
     * @param list
     */
    public void setRiskProfileList(List<RiskProfile> list) {
        riskProfileList = list;
    }

    /** 
     * Get the 'BeginRevealing' element value. Дата и время начала выявления
     * 
     * @return value
     */
    public String getBeginRevealing() {
        return beginRevealing;
    }

    /** 
     * Set the 'BeginRevealing' element value. Дата и время начала выявления
     * 
     * @param beginRevealing
     */
    public void setBeginRevealing(String beginRevealing) {
        this.beginRevealing = beginRevealing;
    }

    /** 
     * Get the 'EndRevealing' element value. Дата и время начала выявления
     * 
     * @return value
     */
    public String getEndRevealing() {
        return endRevealing;
    }

    /** 
     * Set the 'EndRevealing' element value. Дата и время начала выявления
     * 
     * @param endRevealing
     */
    public void setEndRevealing(String endRevealing) {
        this.endRevealing = endRevealing;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа (код документа в Альбоме форматов для РФ)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа (код документа в Альбоме форматов для РФ)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
    /** 
     * Schema fragment(s) for this class:
     * <pre>
     * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RiskProfile" minOccurs="0" maxOccurs="unbounded">
     *   &lt;xs:complexType>
     *     &lt;xs:sequence>
     *       &lt;xs:element type="xs:string" name="AlertedSign"/>
     *       &lt;xs:element type="xs:string" name="RiskProfileNumber"/>
     *       &lt;xs:element name="Goods" minOccurs="0" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class Goods -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="ExcludeGoodsCategory" minOccurs="0" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class ExcludeGoodsCategory -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="Customs" minOccurs="0" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class Customs -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="Consignment" minOccurs="0" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class Consignment -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="HaulingUnit" minOccurs="0" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class HaulingUnit -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="MemberVED" minOccurs="0" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class MemberVED -->
     *       &lt;/xs:element>
     *       &lt;xs:element name="ConsignmentExtended" minOccurs="0" maxOccurs="unbounded">
     *         &lt;!-- Reference to inner class ConsignmentExtended -->
     *       &lt;/xs:element>
     *     &lt;/xs:sequence>
     *   &lt;/xs:complexType>
     * &lt;/xs:element>
     * </pre>
     */
    public static class RiskProfile
    {
        private String alertedSign;
        private String riskProfileNumber;
        private List<Goods> goodList = new ArrayList<Goods>();
        private List<ExcludeGoodsCategory> excludeGoodsCategoryList = new ArrayList<ExcludeGoodsCategory>();
        private List<Customs> customList = new ArrayList<Customs>();
        private List<Consignment> consignmentList = new ArrayList<Consignment>();
        private List<HaulingUnit> haulingUnitList = new ArrayList<HaulingUnit>();
        private List<MemberVED> memberVEDList = new ArrayList<MemberVED>();
        private List<ConsignmentExtended> consignmentExtendedList = new ArrayList<ConsignmentExtended>();

        /** 
         * Get the 'AlertedSign' element value. Признак выявления профиля риска (true - выявлен, false - не выявлен)
         * 
         * @return value
         */
        public String getAlertedSign() {
            return alertedSign;
        }

        /** 
         * Set the 'AlertedSign' element value. Признак выявления профиля риска (true - выявлен, false - не выявлен)
         * 
         * @param alertedSign
         */
        public void setAlertedSign(String alertedSign) {
            this.alertedSign = alertedSign;
        }

        /** 
         * Get the 'RiskProfileNumber' element value. Номер профиля риска/проекта профиля риска в формате TT/CCCCC/DDMMYY/NNNNN (V)
         * 
         * @return value
         */
        public String getRiskProfileNumber() {
            return riskProfileNumber;
        }

        /** 
         * Set the 'RiskProfileNumber' element value. Номер профиля риска/проекта профиля риска в формате TT/CCCCC/DDMMYY/NNNNN (V)
         * 
         * @param riskProfileNumber
         */
        public void setRiskProfileNumber(String riskProfileNumber) {
            this.riskProfileNumber = riskProfileNumber;
        }

        /** 
         * Get the list of 'Goods' element items.
         * 
         * @return list
         */
        public List<Goods> getGoodList() {
            return goodList;
        }

        /** 
         * Set the list of 'Goods' element items.
         * 
         * @param list
         */
        public void setGoodList(List<Goods> list) {
            goodList = list;
        }

        /** 
         * Get the list of 'ExcludeGoodsCategory' element items.
         * 
         * @return list
         */
        public List<ExcludeGoodsCategory> getExcludeGoodsCategoryList() {
            return excludeGoodsCategoryList;
        }

        /** 
         * Set the list of 'ExcludeGoodsCategory' element items.
         * 
         * @param list
         */
        public void setExcludeGoodsCategoryList(List<ExcludeGoodsCategory> list) {
            excludeGoodsCategoryList = list;
        }

        /** 
         * Get the list of 'Customs' element items.
         * 
         * @return list
         */
        public List<Customs> getCustomList() {
            return customList;
        }

        /** 
         * Set the list of 'Customs' element items.
         * 
         * @param list
         */
        public void setCustomList(List<Customs> list) {
            customList = list;
        }

        /** 
         * Get the list of 'Consignment' element items.
         * 
         * @return list
         */
        public List<Consignment> getConsignmentList() {
            return consignmentList;
        }

        /** 
         * Set the list of 'Consignment' element items.
         * 
         * @param list
         */
        public void setConsignmentList(List<Consignment> list) {
            consignmentList = list;
        }

        /** 
         * Get the list of 'HaulingUnit' element items.
         * 
         * @return list
         */
        public List<HaulingUnit> getHaulingUnitList() {
            return haulingUnitList;
        }

        /** 
         * Set the list of 'HaulingUnit' element items.
         * 
         * @param list
         */
        public void setHaulingUnitList(List<HaulingUnit> list) {
            haulingUnitList = list;
        }

        /** 
         * Get the list of 'MemberVED' element items.
         * 
         * @return list
         */
        public List<MemberVED> getMemberVEDList() {
            return memberVEDList;
        }

        /** 
         * Set the list of 'MemberVED' element items.
         * 
         * @param list
         */
        public void setMemberVEDList(List<MemberVED> list) {
            memberVEDList = list;
        }

        /** 
         * Get the list of 'ConsignmentExtended' element items.
         * 
         * @return list
         */
        public List<ConsignmentExtended> getConsignmentExtendedList() {
            return consignmentExtendedList;
        }

        /** 
         * Set the list of 'ConsignmentExtended' element items.
         * 
         * @param list
         */
        public void setConsignmentExtendedList(List<ConsignmentExtended> list) {
            consignmentExtendedList = list;
        }
        /** 
         * Индикаторы группы Товар
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Goods" minOccurs="0" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:RevealingProtocolGroup">
         *         &lt;xs:sequence>
         *           &lt;xs:element name="GoodsSeason" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class GoodsSeason -->
         *           &lt;/xs:element>
         *           &lt;xs:element name="GoodsCountry" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class GoodsCountry -->
         *           &lt;/xs:element>
         *           &lt;xs:element name="GoodsAttributes" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class GoodsAttributes -->
         *           &lt;/xs:element>
         *           &lt;xs:element name="GoodsPayment" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class GoodsPayment -->
         *           &lt;/xs:element>
         *           &lt;xs:element name="GoodsDoc" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class GoodsDoc -->
         *           &lt;/xs:element>
         *           &lt;xs:element name="GoodsPreference" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class GoodsPreference -->
         *           &lt;/xs:element>
         *           &lt;xs:element name="GoodsProcedure" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class GoodsProcedure -->
         *           &lt;/xs:element>
         *           &lt;xs:element name="ExcludeGoods" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class ExcludeGoods -->
         *           &lt;/xs:element>
         *         &lt;/xs:sequence>
         *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class Goods extends RevealingProtocolGroup
        {
            private List<GoodsSeason> goodsSeasonList = new ArrayList<GoodsSeason>();
            private List<GoodsCountry> goodsCountryList = new ArrayList<GoodsCountry>();
            private List<GoodsAttributes> goodsAttributeList = new ArrayList<GoodsAttributes>();
            private List<GoodsPayment> goodsPaymentList = new ArrayList<GoodsPayment>();
            private List<GoodsDoc> goodsDocList = new ArrayList<GoodsDoc>();
            private List<GoodsPreference> goodsPreferenceList = new ArrayList<GoodsPreference>();
            private List<GoodsProcedure> goodsProcedureList = new ArrayList<GoodsProcedure>();
            private List<ExcludeGoods> excludeGoodList = new ArrayList<ExcludeGoods>();
            private String isExclusion;

            /** 
             * Get the list of 'GoodsSeason' element items.
             * 
             * @return list
             */
            public List<GoodsSeason> getGoodsSeasonList() {
                return goodsSeasonList;
            }

            /** 
             * Set the list of 'GoodsSeason' element items.
             * 
             * @param list
             */
            public void setGoodsSeasonList(List<GoodsSeason> list) {
                goodsSeasonList = list;
            }

            /** 
             * Get the list of 'GoodsCountry' element items.
             * 
             * @return list
             */
            public List<GoodsCountry> getGoodsCountryList() {
                return goodsCountryList;
            }

            /** 
             * Set the list of 'GoodsCountry' element items.
             * 
             * @param list
             */
            public void setGoodsCountryList(List<GoodsCountry> list) {
                goodsCountryList = list;
            }

            /** 
             * Get the list of 'GoodsAttributes' element items.
             * 
             * @return list
             */
            public List<GoodsAttributes> getGoodsAttributeList() {
                return goodsAttributeList;
            }

            /** 
             * Set the list of 'GoodsAttributes' element items.
             * 
             * @param list
             */
            public void setGoodsAttributeList(List<GoodsAttributes> list) {
                goodsAttributeList = list;
            }

            /** 
             * Get the list of 'GoodsPayment' element items.
             * 
             * @return list
             */
            public List<GoodsPayment> getGoodsPaymentList() {
                return goodsPaymentList;
            }

            /** 
             * Set the list of 'GoodsPayment' element items.
             * 
             * @param list
             */
            public void setGoodsPaymentList(List<GoodsPayment> list) {
                goodsPaymentList = list;
            }

            /** 
             * Get the list of 'GoodsDoc' element items.
             * 
             * @return list
             */
            public List<GoodsDoc> getGoodsDocList() {
                return goodsDocList;
            }

            /** 
             * Set the list of 'GoodsDoc' element items.
             * 
             * @param list
             */
            public void setGoodsDocList(List<GoodsDoc> list) {
                goodsDocList = list;
            }

            /** 
             * Get the list of 'GoodsPreference' element items.
             * 
             * @return list
             */
            public List<GoodsPreference> getGoodsPreferenceList() {
                return goodsPreferenceList;
            }

            /** 
             * Set the list of 'GoodsPreference' element items.
             * 
             * @param list
             */
            public void setGoodsPreferenceList(List<GoodsPreference> list) {
                goodsPreferenceList = list;
            }

            /** 
             * Get the list of 'GoodsProcedure' element items.
             * 
             * @return list
             */
            public List<GoodsProcedure> getGoodsProcedureList() {
                return goodsProcedureList;
            }

            /** 
             * Set the list of 'GoodsProcedure' element items.
             * 
             * @param list
             */
            public void setGoodsProcedureList(List<GoodsProcedure> list) {
                goodsProcedureList = list;
            }

            /** 
             * Get the list of 'ExcludeGoods' element items.
             * 
             * @return list
             */
            public List<ExcludeGoods> getExcludeGoodList() {
                return excludeGoodList;
            }

            /** 
             * Set the list of 'ExcludeGoods' element items.
             * 
             * @param list
             */
            public void setExcludeGoodList(List<ExcludeGoods> list) {
                excludeGoodList = list;
            }

            /** 
             * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @return value
             */
            public String getIsExclusion() {
                return isExclusion;
            }

            /** 
             * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @param isExclusion
             */
            public void setIsExclusion(String isExclusion) {
                this.isExclusion = isExclusion;
            }
            /** 
             * Сезон декларирования товара 
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsSeason" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class GoodsSeason extends RevealingProtocolGroup
            {
                private String isExclusion;

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
            }
            /** 
             * Страна происхождения
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsCountry" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:sequence>
             *           &lt;xs:element name="ExcludeGoodsCountry" minOccurs="0" maxOccurs="unbounded">
             *             &lt;!-- Reference to inner class ExcludeGoodsCountry -->
             *           &lt;/xs:element>
             *         &lt;/xs:sequence>
             *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class GoodsCountry extends RevealingProtocolGroup
            {
                private List<ExcludeGoodsCountry> excludeGoodsCountryList = new ArrayList<ExcludeGoodsCountry>();
                private String isExclusion;

                /** 
                 * Get the list of 'ExcludeGoodsCountry' element items.
                 * 
                 * @return list
                 */
                public List<ExcludeGoodsCountry> getExcludeGoodsCountryList() {
                    return excludeGoodsCountryList;
                }

                /** 
                 * Set the list of 'ExcludeGoodsCountry' element items.
                 * 
                 * @param list
                 */
                public void setExcludeGoodsCountryList(
                        List<ExcludeGoodsCountry> list) {
                    excludeGoodsCountryList = list;
                }

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
                /** 
                 * Группа Исключения кодов Стран происхождения товара
                 * 
                 * Schema fragment(s) for this class:
                 * <pre>
                 * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcludeGoodsCountry" minOccurs="0" maxOccurs="unbounded">
                 *   &lt;xs:complexType>
                 *     &lt;xs:complexContent>
                 *       &lt;xs:extension base="ns:RevealingProtocolGroup">
                 *         &lt;xs:attribute type="xs:string" use="required" fixed="true" name="IsExclusion"/>
                 *       &lt;/xs:extension>
                 *     &lt;/xs:complexContent>
                 *   &lt;/xs:complexType>
                 * &lt;/xs:element>
                 * </pre>
                 */
                public static class ExcludeGoodsCountry
                        extends
                            RevealingProtocolGroup
                {
                    private String isExclusion;

                    /** 
                     * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @return value
                     */
                    public String getIsExclusion() {
                        return isExclusion;
                    }

                    /** 
                     * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @param isExclusion
                     */
                    public void setIsExclusion(String isExclusion) {
                        this.isExclusion = isExclusion;
                    }
                }
            }
            /** 
             * Группа Товар-Характеристики товара
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsAttributes" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class GoodsAttributes extends RevealingProtocolGroup
            {
                private String isExclusion;

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
            }
            /** 
             * Группа Товар-Платежи
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsPayment" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:sequence>
             *           &lt;xs:element name="ExcludeGoodsPayment" minOccurs="0" maxOccurs="unbounded">
             *             &lt;!-- Reference to inner class ExcludeGoodsPayment -->
             *           &lt;/xs:element>
             *         &lt;/xs:sequence>
             *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class GoodsPayment extends RevealingProtocolGroup
            {
                private List<ExcludeGoodsPayment> excludeGoodsPaymentList = new ArrayList<ExcludeGoodsPayment>();
                private String isExclusion;

                /** 
                 * Get the list of 'ExcludeGoodsPayment' element items.
                 * 
                 * @return list
                 */
                public List<ExcludeGoodsPayment> getExcludeGoodsPaymentList() {
                    return excludeGoodsPaymentList;
                }

                /** 
                 * Set the list of 'ExcludeGoodsPayment' element items.
                 * 
                 * @param list
                 */
                public void setExcludeGoodsPaymentList(
                        List<ExcludeGoodsPayment> list) {
                    excludeGoodsPaymentList = list;
                }

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
                /** 
                 * Исключения группы Товар-Платежи
                 * 
                 * Schema fragment(s) for this class:
                 * <pre>
                 * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcludeGoodsPayment" minOccurs="0" maxOccurs="unbounded">
                 *   &lt;xs:complexType>
                 *     &lt;xs:complexContent>
                 *       &lt;xs:extension base="ns:RevealingProtocolGroup">
                 *         &lt;xs:attribute type="xs:string" use="required" fixed="true" name="IsExclusion"/>
                 *       &lt;/xs:extension>
                 *     &lt;/xs:complexContent>
                 *   &lt;/xs:complexType>
                 * &lt;/xs:element>
                 * </pre>
                 */
                public static class ExcludeGoodsPayment
                        extends
                            RevealingProtocolGroup
                {
                    private String isExclusion;

                    /** 
                     * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @return value
                     */
                    public String getIsExclusion() {
                        return isExclusion;
                    }

                    /** 
                     * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @param isExclusion
                     */
                    public void setIsExclusion(String isExclusion) {
                        this.isExclusion = isExclusion;
                    }
                }
            }
            /** 
             * Группа Товар-Документы 44 графы ДТ
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsDoc" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:sequence>
             *           &lt;xs:element name="GoodsDocMask" minOccurs="0" maxOccurs="unbounded">
             *             &lt;!-- Reference to inner class GoodsDocMask -->
             *           &lt;/xs:element>
             *           &lt;xs:element name="ExcludeGoodsDoc" minOccurs="0" maxOccurs="unbounded">
             *             &lt;!-- Reference to inner class ExcludeGoodsDoc -->
             *           &lt;/xs:element>
             *         &lt;/xs:sequence>
             *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class GoodsDoc extends RevealingProtocolGroup
            {
                private List<GoodsDocMask> goodsDocMaskList = new ArrayList<GoodsDocMask>();
                private List<ExcludeGoodsDoc> excludeGoodsDocList = new ArrayList<ExcludeGoodsDoc>();
                private String isExclusion;

                /** 
                 * Get the list of 'GoodsDocMask' element items.
                 * 
                 * @return list
                 */
                public List<GoodsDocMask> getGoodsDocMaskList() {
                    return goodsDocMaskList;
                }

                /** 
                 * Set the list of 'GoodsDocMask' element items.
                 * 
                 * @param list
                 */
                public void setGoodsDocMaskList(List<GoodsDocMask> list) {
                    goodsDocMaskList = list;
                }

                /** 
                 * Get the list of 'ExcludeGoodsDoc' element items.
                 * 
                 * @return list
                 */
                public List<ExcludeGoodsDoc> getExcludeGoodsDocList() {
                    return excludeGoodsDocList;
                }

                /** 
                 * Set the list of 'ExcludeGoodsDoc' element items.
                 * 
                 * @param list
                 */
                public void setExcludeGoodsDocList(List<ExcludeGoodsDoc> list) {
                    excludeGoodsDocList = list;
                }

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
                /** 
                 * Группа Документы - Маски докуметов
                 * 
                 * Schema fragment(s) for this class:
                 * <pre>
                 * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsDocMask" minOccurs="0" maxOccurs="unbounded">
                 *   &lt;xs:complexType>
                 *     &lt;xs:complexContent>
                 *       &lt;xs:extension base="ns:RevealingProtocolGroup">
                 *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
                 *       &lt;/xs:extension>
                 *     &lt;/xs:complexContent>
                 *   &lt;/xs:complexType>
                 * &lt;/xs:element>
                 * </pre>
                 */
                public static class GoodsDocMask extends RevealingProtocolGroup
                {
                    private String isExclusion;

                    /** 
                     * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @return value
                     */
                    public String getIsExclusion() {
                        return isExclusion;
                    }

                    /** 
                     * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @param isExclusion
                     */
                    public void setIsExclusion(String isExclusion) {
                        this.isExclusion = isExclusion;
                    }
                }
                /** 
                 * Исключения группы Товар-Документы 44 графы
                 * 
                 * Schema fragment(s) for this class:
                 * <pre>
                 * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcludeGoodsDoc" minOccurs="0" maxOccurs="unbounded">
                 *   &lt;xs:complexType>
                 *     &lt;xs:complexContent>
                 *       &lt;xs:extension base="ns:RevealingProtocolGroup">
                 *         &lt;xs:attribute type="xs:string" use="required" fixed="true" name="IsExclusion"/>
                 *       &lt;/xs:extension>
                 *     &lt;/xs:complexContent>
                 *   &lt;/xs:complexType>
                 * &lt;/xs:element>
                 * </pre>
                 */
                public static class ExcludeGoodsDoc
                        extends
                            RevealingProtocolGroup
                {
                    private String isExclusion;

                    /** 
                     * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @return value
                     */
                    public String getIsExclusion() {
                        return isExclusion;
                    }

                    /** 
                     * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @param isExclusion
                     */
                    public void setIsExclusion(String isExclusion) {
                        this.isExclusion = isExclusion;
                    }
                }
            }
            /** 
             * Группа Товар - Преференции и льготы 
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsPreference" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class GoodsPreference extends RevealingProtocolGroup
            {
                private String isExclusion;

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
            }
            /** 
             * Группа Товар - Процедура
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoodsProcedure" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:sequence>
             *           &lt;xs:element name="ExcludeGoodsProcedure" minOccurs="0" maxOccurs="unbounded">
             *             &lt;!-- Reference to inner class ExcludeGoodsProcedure -->
             *           &lt;/xs:element>
             *         &lt;/xs:sequence>
             *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class GoodsProcedure extends RevealingProtocolGroup
            {
                private List<ExcludeGoodsProcedure> excludeGoodsProcedureList = new ArrayList<ExcludeGoodsProcedure>();
                private String isExclusion;

                /** 
                 * Get the list of 'ExcludeGoodsProcedure' element items.
                 * 
                 * @return list
                 */
                public List<ExcludeGoodsProcedure> getExcludeGoodsProcedureList() {
                    return excludeGoodsProcedureList;
                }

                /** 
                 * Set the list of 'ExcludeGoodsProcedure' element items.
                 * 
                 * @param list
                 */
                public void setExcludeGoodsProcedureList(
                        List<ExcludeGoodsProcedure> list) {
                    excludeGoodsProcedureList = list;
                }

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
                /** 
                 * Исключения группы Товар - Процедура
                 * 
                 * Schema fragment(s) for this class:
                 * <pre>
                 * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcludeGoodsProcedure" minOccurs="0" maxOccurs="unbounded">
                 *   &lt;xs:complexType>
                 *     &lt;xs:complexContent>
                 *       &lt;xs:extension base="ns:RevealingProtocolGroup">
                 *         &lt;xs:attribute type="xs:string" use="required" fixed="true" name="IsExclusion"/>
                 *       &lt;/xs:extension>
                 *     &lt;/xs:complexContent>
                 *   &lt;/xs:complexType>
                 * &lt;/xs:element>
                 * </pre>
                 */
                public static class ExcludeGoodsProcedure
                        extends
                            RevealingProtocolGroup
                {
                    private String isExclusion;

                    /** 
                     * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @return value
                     */
                    public String getIsExclusion() {
                        return isExclusion;
                    }

                    /** 
                     * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @param isExclusion
                     */
                    public void setIsExclusion(String isExclusion) {
                        this.isExclusion = isExclusion;
                    }
                }
            }
            /** 
             * Иключения Группы Товары
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcludeGoods" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:attribute type="xs:string" use="required" fixed="true" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class ExcludeGoods extends RevealingProtocolGroup
            {
                private String isExclusion;

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
            }
        }
        /** 
         * Группа Исключения для категории товаров
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcludeGoodsCategory" minOccurs="0" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:RevealingProtocolGroup">
         *         &lt;xs:attribute type="xs:string" use="required" fixed="true" name="IsExclusion"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class ExcludeGoodsCategory extends RevealingProtocolGroup
        {
            private String isExclusion;

            /** 
             * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @return value
             */
            public String getIsExclusion() {
                return isExclusion;
            }

            /** 
             * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @param isExclusion
             */
            public void setIsExclusion(String isExclusion) {
                this.isExclusion = isExclusion;
            }
        }
        /** 
         * Группа Таможенный орган
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Customs" minOccurs="0" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:RevealingProtocolGroup">
         *         &lt;xs:sequence>
         *           &lt;xs:element name="ExcludeCustoms" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class ExcludeCustoms -->
         *           &lt;/xs:element>
         *         &lt;/xs:sequence>
         *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class Customs extends RevealingProtocolGroup
        {
            private List<ExcludeCustoms> excludeCustomList = new ArrayList<ExcludeCustoms>();
            private String isExclusion;

            /** 
             * Get the list of 'ExcludeCustoms' element items.
             * 
             * @return list
             */
            public List<ExcludeCustoms> getExcludeCustomList() {
                return excludeCustomList;
            }

            /** 
             * Set the list of 'ExcludeCustoms' element items.
             * 
             * @param list
             */
            public void setExcludeCustomList(List<ExcludeCustoms> list) {
                excludeCustomList = list;
            }

            /** 
             * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @return value
             */
            public String getIsExclusion() {
                return isExclusion;
            }

            /** 
             * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @param isExclusion
             */
            public void setIsExclusion(String isExclusion) {
                this.isExclusion = isExclusion;
            }
            /** 
             * Индикаторы исключения группы Таможенный орган
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcludeCustoms" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:attribute type="xs:string" use="required" fixed="true" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class ExcludeCustoms extends RevealingProtocolGroup
            {
                private String isExclusion;

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
            }
        }
        /** 
         * Группа Партия товара
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Consignment" minOccurs="0" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:RevealingProtocolGroup">
         *         &lt;xs:sequence>
         *           &lt;xs:element name="ExcludeConsignment" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class ExcludeConsignment -->
         *           &lt;/xs:element>
         *         &lt;/xs:sequence>
         *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class Consignment extends RevealingProtocolGroup
        {
            private List<ExcludeConsignment> excludeConsignmentList = new ArrayList<ExcludeConsignment>();
            private String isExclusion;

            /** 
             * Get the list of 'ExcludeConsignment' element items.
             * 
             * @return list
             */
            public List<ExcludeConsignment> getExcludeConsignmentList() {
                return excludeConsignmentList;
            }

            /** 
             * Set the list of 'ExcludeConsignment' element items.
             * 
             * @param list
             */
            public void setExcludeConsignmentList(List<ExcludeConsignment> list) {
                excludeConsignmentList = list;
            }

            /** 
             * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @return value
             */
            public String getIsExclusion() {
                return isExclusion;
            }

            /** 
             * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @param isExclusion
             */
            public void setIsExclusion(String isExclusion) {
                this.isExclusion = isExclusion;
            }
            /** 
             * Исключения группы Товарная Партия
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcludeConsignment" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:attribute type="xs:string" use="required" fixed="true" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class ExcludeConsignment
                    extends
                        RevealingProtocolGroup
            {
                private String isExclusion;

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
            }
        }
        /** 
         * Группа Транспортное средство
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HaulingUnit" minOccurs="0" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:RevealingProtocolGroup">
         *         &lt;xs:sequence>
         *           &lt;xs:element name="ExcludeHaulingUnit" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class ExcludeHaulingUnit -->
         *           &lt;/xs:element>
         *         &lt;/xs:sequence>
         *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class HaulingUnit extends RevealingProtocolGroup
        {
            private List<ExcludeHaulingUnit> excludeHaulingUnitList = new ArrayList<ExcludeHaulingUnit>();
            private String isExclusion;

            /** 
             * Get the list of 'ExcludeHaulingUnit' element items.
             * 
             * @return list
             */
            public List<ExcludeHaulingUnit> getExcludeHaulingUnitList() {
                return excludeHaulingUnitList;
            }

            /** 
             * Set the list of 'ExcludeHaulingUnit' element items.
             * 
             * @param list
             */
            public void setExcludeHaulingUnitList(List<ExcludeHaulingUnit> list) {
                excludeHaulingUnitList = list;
            }

            /** 
             * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @return value
             */
            public String getIsExclusion() {
                return isExclusion;
            }

            /** 
             * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @param isExclusion
             */
            public void setIsExclusion(String isExclusion) {
                this.isExclusion = isExclusion;
            }
            /** 
             * Исключения 
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcludeHaulingUnit" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:attribute type="xs:string" use="required" fixed="true" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class ExcludeHaulingUnit
                    extends
                        RevealingProtocolGroup
            {
                private String isExclusion;

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
            }
        }
        /** 
         * Группа Субъъект ВЭД
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MemberVED" minOccurs="0" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:RevealingProtocolGroup">
         *         &lt;xs:sequence>
         *           &lt;xs:element name="MemberVEDCountry" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class MemberVEDCountry -->
         *           &lt;/xs:element>
         *           &lt;xs:element name="ExcludeMemberVED" minOccurs="0" maxOccurs="unbounded">
         *             &lt;!-- Reference to inner class ExcludeMemberVED -->
         *           &lt;/xs:element>
         *         &lt;/xs:sequence>
         *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class MemberVED extends RevealingProtocolGroup
        {
            private List<MemberVEDCountry> memberVEDCountryList = new ArrayList<MemberVEDCountry>();
            private List<ExcludeMemberVED> excludeMemberVEDList = new ArrayList<ExcludeMemberVED>();
            private String isExclusion;

            /** 
             * Get the list of 'MemberVEDCountry' element items.
             * 
             * @return list
             */
            public List<MemberVEDCountry> getMemberVEDCountryList() {
                return memberVEDCountryList;
            }

            /** 
             * Set the list of 'MemberVEDCountry' element items.
             * 
             * @param list
             */
            public void setMemberVEDCountryList(List<MemberVEDCountry> list) {
                memberVEDCountryList = list;
            }

            /** 
             * Get the list of 'ExcludeMemberVED' element items.
             * 
             * @return list
             */
            public List<ExcludeMemberVED> getExcludeMemberVEDList() {
                return excludeMemberVEDList;
            }

            /** 
             * Set the list of 'ExcludeMemberVED' element items.
             * 
             * @param list
             */
            public void setExcludeMemberVEDList(List<ExcludeMemberVED> list) {
                excludeMemberVEDList = list;
            }

            /** 
             * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @return value
             */
            public String getIsExclusion() {
                return isExclusion;
            }

            /** 
             * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @param isExclusion
             */
            public void setIsExclusion(String isExclusion) {
                this.isExclusion = isExclusion;
            }
            /** 
             * Страна субъекта ВЭД
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MemberVEDCountry" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:sequence>
             *           &lt;xs:element name="ExcludeMemberVEDCountry" minOccurs="0" maxOccurs="unbounded">
             *             &lt;!-- Reference to inner class ExcludeMemberVEDCountry -->
             *           &lt;/xs:element>
             *         &lt;/xs:sequence>
             *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class MemberVEDCountry extends RevealingProtocolGroup
            {
                private List<ExcludeMemberVEDCountry> excludeMemberVEDCountryList = new ArrayList<ExcludeMemberVEDCountry>();
                private String isExclusion;

                /** 
                 * Get the list of 'ExcludeMemberVEDCountry' element items.
                 * 
                 * @return list
                 */
                public List<ExcludeMemberVEDCountry> getExcludeMemberVEDCountryList() {
                    return excludeMemberVEDCountryList;
                }

                /** 
                 * Set the list of 'ExcludeMemberVEDCountry' element items.
                 * 
                 * @param list
                 */
                public void setExcludeMemberVEDCountryList(
                        List<ExcludeMemberVEDCountry> list) {
                    excludeMemberVEDCountryList = list;
                }

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
                /** 
                 * Исключения Страны
                 * 
                 * Schema fragment(s) for this class:
                 * <pre>
                 * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcludeMemberVEDCountry" minOccurs="0" maxOccurs="unbounded">
                 *   &lt;xs:complexType>
                 *     &lt;xs:complexContent>
                 *       &lt;xs:extension base="ns:RevealingProtocolGroup">
                 *         &lt;xs:attribute type="xs:string" use="required" fixed="true" name="IsExclusion"/>
                 *       &lt;/xs:extension>
                 *     &lt;/xs:complexContent>
                 *   &lt;/xs:complexType>
                 * &lt;/xs:element>
                 * </pre>
                 */
                public static class ExcludeMemberVEDCountry
                        extends
                            RevealingProtocolGroup
                {
                    private String isExclusion;

                    /** 
                     * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @return value
                     */
                    public String getIsExclusion() {
                        return isExclusion;
                    }

                    /** 
                     * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                     * 
                     * @param isExclusion
                     */
                    public void setIsExclusion(String isExclusion) {
                        this.isExclusion = isExclusion;
                    }
                }
            }
            /** 
             * Исключения группы Субъект ВЭД
             * 
             * Schema fragment(s) for this class:
             * <pre>
             * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcludeMemberVED" minOccurs="0" maxOccurs="unbounded">
             *   &lt;xs:complexType>
             *     &lt;xs:complexContent>
             *       &lt;xs:extension base="ns:RevealingProtocolGroup">
             *         &lt;xs:attribute type="xs:string" use="required" fixed="true" name="IsExclusion"/>
             *       &lt;/xs:extension>
             *     &lt;/xs:complexContent>
             *   &lt;/xs:complexType>
             * &lt;/xs:element>
             * </pre>
             */
            public static class ExcludeMemberVED extends RevealingProtocolGroup
            {
                private String isExclusion;

                /** 
                 * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @return value
                 */
                public String getIsExclusion() {
                    return isExclusion;
                }

                /** 
                 * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
                 * 
                 * @param isExclusion
                 */
                public void setIsExclusion(String isExclusion) {
                    this.isExclusion = isExclusion;
                }
            }
        }
        /** 
         * Группа Характеристики транзитной декларации
         * 
         * Schema fragment(s) for this class:
         * <pre>
         * &lt;xs:element xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RevealedRiskProtocol:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConsignmentExtended" minOccurs="0" maxOccurs="unbounded">
         *   &lt;xs:complexType>
         *     &lt;xs:complexContent>
         *       &lt;xs:extension base="ns:RevealingProtocolGroup">
         *         &lt;xs:attribute type="xs:string" use="required" fixed="false" name="IsExclusion"/>
         *       &lt;/xs:extension>
         *     &lt;/xs:complexContent>
         *   &lt;/xs:complexType>
         * &lt;/xs:element>
         * </pre>
         */
        public static class ConsignmentExtended extends RevealingProtocolGroup
        {
            private String isExclusion;

            /** 
             * Get the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @return value
             */
            public String getIsExclusion() {
                return isExclusion;
            }

            /** 
             * Set the 'IsExclusion' attribute value. Признак, является ли группа, группой  исключающих индикаторов (true - является, false - не является)
             * 
             * @param isExclusion
             */
            public void setIsExclusion(String isExclusion) {
                this.isExclusion = isExclusion;
            }
        }
    }
}
