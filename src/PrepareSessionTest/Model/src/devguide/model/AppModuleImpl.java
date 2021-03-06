/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package devguide.model;
import oracle.jbo.ApplicationPoolSvcMsgContext;
import oracle.jbo.Session;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl {
  /**This is the default constructor (do not remove)
   */
  public AppModuleImpl() {
  }

  /**Container's getter for DeptView1
   */
  public ViewObjectImpl getDeptView1() {
    return (ViewObjectImpl)findViewObject("DeptView1");
  }

  /**Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("devguide.model", /* package name */
      "AppModuleLocal" /* Configuration Name */);
  }
  protected void prepareSession(Session Session) {
    super.prepareSession(Session);
    log("prepareSession()");
  }
  protected void afterConnect() {
    super.afterConnect();
    log("afterConnect()");
  }
  public ApplicationPoolSvcMsgContext doPoolMessage(ApplicationPoolSvcMsgContext ctx) {
    int op = ctx.getRequest().getOperation();
    switch (op) {
//      case ApplicationPoolSvcMsgContext.POOL_REQ_RESET_STATE: {
//        log("release stateless");
//        break;
//      }
//      case ApplicationPoolSvcMsgContext.POOL_REQ_PASSIVATE_STATE: {
//        log("passivate state");
//        break;        
//      }
      case ApplicationPoolSvcMsgContext.POOL_REQ_RECONNECT:
      {
         log("using existing AM");         
         break;
      }
      case ApplicationPoolSvcMsgContext.POOL_REQ_REMOVE_STATE: {
        log("removing state");         
        break;
        
      }
//      case ApplicationPoolSvcMsgContext.POOL_REQ_ACTIVATE_STATE: {
//        log("activating state");         
//        break;
//        
//      }
    }
    return super.doPoolMessage(ctx);
  }
  private void log(String m) {
    System.out.println(
    "#### (" + getClass().getName()
    + "@" + Integer.toHexString(hashCode())
    +" "+m);
  }
  protected void passivateState(Document doc, Element parent) {
    super.passivateState(doc, parent);
    log("passivate state");    
  }
  protected void activateState(Element parent) {
    super.activateState(parent);
    log("activate state");    
  }
  public void reset() {
    super.reset();
    log("reset");  
  }
}
