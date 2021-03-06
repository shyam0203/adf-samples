/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RegionsImpl extends EntityImpl {
  public static final int REGIONID = 0;
  public static final int REGIONNAME = 1;
  public static final int COUNTRIES = 2;
  public static final int CITIES = 3;
  private static EntityDefImpl mDefinitionObject;

  /**This is the default constructor (do not remove)
   */
  public RegionsImpl() {
  }

  /**Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject() {
    if (mDefinitionObject == null) {
      mDefinitionObject = (EntityDefImpl)EntityDefImpl.findDefObject("test.model.Regions");
    }
    return mDefinitionObject;
  }

  /**Gets the attribute value for RegionId, using the alias name RegionId
   */
  public Number getRegionId() {
    return (Number)getAttributeInternal(REGIONID);
  }

  /**Sets <code>value</code> as the attribute value for RegionId
   */
  public void setRegionId(Number value) {
    setAttributeInternal(REGIONID, value);
  }

  /**Gets the attribute value for RegionName, using the alias name RegionName
   */
  public String getRegionName() {
    return (String)getAttributeInternal(REGIONNAME);
  }

  /**Sets <code>value</code> as the attribute value for RegionName
   */
  public void setRegionName(String value) {
    setAttributeInternal(REGIONNAME, value);
  }

  /**getAttrInvokeAccessor: generated method. Do not modify.
   */
  protected Object getAttrInvokeAccessor(int index, 
                                         AttributeDefImpl attrDef) throws Exception {
    switch (index) {
    case REGIONID:
      return getRegionId();
    case REGIONNAME:
      return getRegionName();
    case COUNTRIES:
      return getCountries();
    case CITIES:
      return getCities();
    default:
      return super.getAttrInvokeAccessor(index, attrDef);
    }
  }

  /**setAttrInvokeAccessor: generated method. Do not modify.
   */
  protected void setAttrInvokeAccessor(int index, Object value, 
                                       AttributeDefImpl attrDef) throws Exception {
    switch (index) {
    case REGIONID:
      setRegionId((Number)value);
      return;
    case REGIONNAME:
      setRegionName((String)value);
      return;
    default:
      super.setAttrInvokeAccessor(index, value, attrDef);
      return;
    }
  }

  /**Gets the associated entity oracle.jbo.RowIterator
   */
  public RowIterator getCountries() {
    return (RowIterator)getAttributeInternal(COUNTRIES);
  }

  /**Gets the associated entity oracle.jbo.RowIterator
   */
  public RowIterator getCities() {
    return (RowIterator)getAttributeInternal(CITIES);
  }

  /**Creates a Key object based on given key constituents
   */
  public static Key createPrimaryKey(Number regionId) {
    return new Key(new Object[]{regionId});
  }
}
