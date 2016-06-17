package tp2;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i8 = iP7.getFirst();
    java.lang.String str9 = iP7.toString();
    boolean b10 = server0.addBan(iP7);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b8 = server0.connect(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP10 = null;
    boolean b11 = server9.connect(iP10);
    java.lang.String str12 = server9.toString();
    java.lang.String str13 = server9.toString();
    tp2.Entry entry14 = new tp2.Entry();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getFirst();
    java.lang.String str21 = iP19.toString();
    entry14.element = iP19;
    boolean b23 = server9.connect(iP19);
    boolean b24 = server0.removeException(iP19);
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)100);
    iP29.setFourth((java.lang.Integer)1);
    java.lang.Integer i32 = iP29.getFourth();
    boolean b33 = server0.addBan(iP29);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b8 = server0.connect(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP10 = null;
    boolean b11 = server9.connect(iP10);
    java.lang.String str12 = server9.toString();
    java.lang.String str13 = server9.toString();
    tp2.Entry entry14 = new tp2.Entry();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getFirst();
    java.lang.String str21 = iP19.toString();
    entry14.element = iP19;
    boolean b23 = server9.connect(iP19);
    boolean b24 = server0.removeException(iP19);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP26 = null;
    boolean b27 = server25.connect(iP26);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b33 = server25.connect(iP32);
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP35 = null;
    boolean b36 = server34.connect(iP35);
    java.lang.String str37 = server34.toString();
    java.lang.String str38 = server34.toString();
    tp2.Entry entry39 = new tp2.Entry();
    tp2.IP iP44 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i45 = iP44.getFirst();
    java.lang.String str46 = iP44.toString();
    entry39.element = iP44;
    boolean b48 = server34.connect(iP44);
    boolean b49 = server25.removeException(iP44);
    boolean b50 = server0.addBan(iP44);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b8 = server0.connect(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP10 = null;
    boolean b11 = server9.connect(iP10);
    java.lang.String str12 = server9.toString();
    java.lang.String str13 = server9.toString();
    tp2.Entry entry14 = new tp2.Entry();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getFirst();
    java.lang.String str21 = iP19.toString();
    entry14.element = iP19;
    boolean b23 = server9.connect(iP19);
    boolean b24 = server0.removeException(iP19);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP26 = null;
    boolean b27 = server25.connect(iP26);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b33 = server25.connect(iP32);
    java.lang.Integer i34 = iP32.getFirst();
    boolean b35 = server0.connect(iP32);
    tp2.IP iP40 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)100);
    iP40.setFourth((java.lang.Integer)1);
    boolean b43 = server0.addBan(iP40);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b8 = server0.connect(iP7);
    tp2.SinglyLinkedList singlyLinkedList9 = new tp2.SinglyLinkedList();
    tp2.IP iP11 = singlyLinkedList9.get((int)' ');
    tp2.Entry entry12 = new tp2.Entry();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getFirst();
    java.lang.String str19 = iP17.toString();
    entry12.element = iP17;
    boolean b21 = singlyLinkedList9.remove(iP17);
    tp2.IPBan iPBan23 = new tp2.IPBan(iP17, (java.lang.Long)1L);
    boolean b24 = server0.addBan(iP17);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP7.setFirst((java.lang.Integer)1);
    boolean b10 = server0.removeException(iP7);
    tp2.Server server11 = new tp2.Server();
    java.lang.String str12 = server11.toString();
    server11.update();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP18.setFirst((java.lang.Integer)1);
    java.lang.Integer i21 = iP18.getSecond();
    boolean b22 = server11.addException(iP18);
    boolean b23 = server0.removeBan(iP18);
    tp2.IP iP28 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP28.setThird((java.lang.Integer)1);
    boolean b31 = server0.addBan(iP28);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP7.setFirst((java.lang.Integer)1);
    boolean b10 = server0.removeException(iP7);
    tp2.SinglyLinkedList singlyLinkedList11 = new tp2.SinglyLinkedList();
    tp2.IP iP13 = singlyLinkedList11.get((int)' ');
    tp2.Entry entry14 = new tp2.Entry();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getFirst();
    java.lang.String str21 = iP19.toString();
    entry14.element = iP19;
    boolean b23 = singlyLinkedList11.remove(iP19);
    tp2.IPBan iPBan25 = new tp2.IPBan(iP19, (java.lang.Long)1L);
    java.lang.String str26 = iPBan25.toString();
    iPBan25.setExpires((java.lang.Long)0L);
    java.lang.Long long29 = iPBan25.expires;
    tp2.IP iP30 = iPBan25.ip;
    java.lang.String str31 = iPBan25.toString();
    tp2.IP iP32 = iPBan25.getIp();
    iP32.setFirst((java.lang.Integer)100);
    boolean b35 = server0.addException(iP32);
    tp2.Server server36 = new tp2.Server();
    java.lang.String str37 = server36.toString();
    tp2.SinglyLinkedList singlyLinkedList38 = new tp2.SinglyLinkedList();
    java.util.Set<tp2.IP> set_iP39 = null;
    boolean b40 = singlyLinkedList38.repOk(set_iP39);
    java.util.Set<tp2.IP> set_iP41 = null;
    boolean b42 = singlyLinkedList38.repOk(set_iP41);
    tp2.SinglyLinkedList singlyLinkedList43 = new tp2.SinglyLinkedList();
    tp2.IP iP45 = singlyLinkedList43.get((int)' ');
    tp2.Entry entry46 = new tp2.Entry();
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i52 = iP51.getFirst();
    java.lang.String str53 = iP51.toString();
    entry46.element = iP51;
    boolean b55 = singlyLinkedList43.remove(iP51);
    tp2.IP iP57 = singlyLinkedList43.get((int)(byte)10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList58 = new tp2.StrictlySortedSinglyLinkedList();
    strictlySortedSinglyLinkedList58.size = 10;
    tp2.Server server61 = new tp2.Server();
    java.lang.String str62 = server61.toString();
    server61.update();
    tp2.IP iP68 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP68.setFirst((java.lang.Integer)1);
    java.lang.Integer i71 = iP68.getSecond();
    boolean b72 = server61.addException(iP68);
    tp2.Entry entry73 = new tp2.Entry();
    tp2.IP iP78 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i79 = iP78.getFirst();
    java.lang.String str80 = iP78.toString();
    entry73.element = iP78;
    boolean b82 = server61.addException(iP78);
    tp2.IP iP87 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b88 = server61.removeBan(iP87);
    iP87.setThird((java.lang.Integer)0);
    boolean b91 = strictlySortedSinglyLinkedList58.removeFromIP(iP87);
    boolean b92 = singlyLinkedList43.contains(iP87);
    boolean b93 = singlyLinkedList38.contains(iP87);
    boolean b94 = server36.removeBan(iP87);
    boolean b95 = server0.addBan(iP87);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    tp2.Server server4 = new tp2.Server();
    tp2.IP iP5 = null;
    boolean b6 = server4.connect(iP5);
    java.lang.String str7 = server4.toString();
    java.lang.String str8 = server4.toString();
    tp2.Entry entry9 = new tp2.Entry();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFirst();
    java.lang.String str16 = iP14.toString();
    entry9.element = iP14;
    boolean b18 = server4.connect(iP14);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getFirst();
    java.lang.String str25 = iP23.toString();
    java.lang.String str26 = iP23.toString();
    boolean b27 = server4.removeBan(iP23);
    iP23.setFirst((java.lang.Integer)10);
    boolean b30 = server0.removeException(iP23);
    tp2.IP iP31 = null;
    boolean b32 = server0.removeException(iP31);
    tp2.Server server33 = new tp2.Server();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b39 = server33.addException(iP38);
    boolean b40 = server0.addBan(iP38);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b8 = server0.connect(iP7);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList9 = new tp2.StrictlySortedSinglyLinkedList();
    strictlySortedSinglyLinkedList9.size = 10;
    tp2.Server server12 = new tp2.Server();
    java.lang.String str13 = server12.toString();
    server12.update();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP19.setFirst((java.lang.Integer)1);
    java.lang.Integer i22 = iP19.getSecond();
    boolean b23 = server12.addException(iP19);
    tp2.Entry entry24 = new tp2.Entry();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getFirst();
    java.lang.String str31 = iP29.toString();
    entry24.element = iP29;
    boolean b33 = server12.addException(iP29);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b39 = server12.removeBan(iP38);
    iP38.setThird((java.lang.Integer)0);
    boolean b42 = strictlySortedSinglyLinkedList9.removeFromIP(iP38);
    tp2.Server server43 = new tp2.Server();
    java.lang.String str44 = server43.toString();
    server43.update();
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP50.setFirst((java.lang.Integer)1);
    java.lang.Integer i53 = iP50.getSecond();
    boolean b54 = server43.addException(iP50);
    boolean b55 = strictlySortedSinglyLinkedList9.removeFromIP(iP50);
    boolean b56 = server0.connect(iP50);
    tp2.IP iP57 = null;
    boolean b58 = server0.addBan(iP57);
    tp2.SinglyLinkedList singlyLinkedList59 = new tp2.SinglyLinkedList();
    tp2.IP iP61 = singlyLinkedList59.get((int)' ');
    tp2.Entry entry62 = new tp2.Entry();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getFirst();
    java.lang.String str69 = iP67.toString();
    entry62.element = iP67;
    boolean b71 = singlyLinkedList59.remove(iP67);
    tp2.IPBan iPBan73 = new tp2.IPBan(iP67, (java.lang.Long)1L);
    tp2.Server server74 = new tp2.Server();
    java.lang.String str75 = server74.toString();
    server74.update();
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    java.lang.Integer i82 = iP81.getFirst();
    boolean b83 = server74.connect(iP81);
    iPBan73.ip = iP81;
    tp2.IP iP85 = iPBan73.getIp();
    tp2.IP iP86 = iPBan73.ip;
    boolean b87 = server0.addBan(iP86);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b8 = server0.connect(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP10 = null;
    boolean b11 = server9.connect(iP10);
    java.lang.String str12 = server9.toString();
    java.lang.String str13 = server9.toString();
    tp2.Entry entry14 = new tp2.Entry();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getFirst();
    java.lang.String str21 = iP19.toString();
    entry14.element = iP19;
    boolean b23 = server9.connect(iP19);
    boolean b24 = server0.removeException(iP19);
    java.lang.String str25 = server0.toString();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP30.setFirst((java.lang.Integer)1);
    java.lang.Integer i33 = iP30.getSecond();
    iP30.setThird((java.lang.Integer)(-1));
    iP30.setThird((java.lang.Integer)1);
    boolean b38 = server0.addBan(iP30);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.Server server3 = new tp2.Server();
    java.lang.String str4 = server3.toString();
    server3.update();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP10.setFirst((java.lang.Integer)1);
    java.lang.Integer i13 = iP10.getSecond();
    boolean b14 = server3.addException(iP10);
    tp2.Entry entry15 = new tp2.Entry();
    tp2.IP iP20 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i21 = iP20.getFirst();
    java.lang.String str22 = iP20.toString();
    entry15.element = iP20;
    boolean b24 = server3.addException(iP20);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList25 = new tp2.StrictlySortedSinglyLinkedList();
    strictlySortedSinglyLinkedList25.size = 10;
    tp2.Server server28 = new tp2.Server();
    java.lang.String str29 = server28.toString();
    server28.update();
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP35.setFirst((java.lang.Integer)1);
    java.lang.Integer i38 = iP35.getSecond();
    boolean b39 = server28.addException(iP35);
    tp2.Entry entry40 = new tp2.Entry();
    tp2.IP iP45 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i46 = iP45.getFirst();
    java.lang.String str47 = iP45.toString();
    entry40.element = iP45;
    boolean b49 = server28.addException(iP45);
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b55 = server28.removeBan(iP54);
    iP54.setThird((java.lang.Integer)0);
    boolean b58 = strictlySortedSinglyLinkedList25.removeFromIP(iP54);
    boolean b59 = server3.addException(iP54);
    java.lang.String str60 = iP54.toString();
    boolean b61 = server0.removeBan(iP54);
    tp2.Entry entry62 = new tp2.Entry();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getFirst();
    entry62.element = iP67;
    iP67.setFirst((java.lang.Integer)1);
    boolean b72 = server0.addBan(iP67);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP7.setFirst((java.lang.Integer)1);
    boolean b10 = server0.removeException(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.connect(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b19 = server11.connect(iP18);
    tp2.Server server20 = new tp2.Server();
    tp2.IP iP21 = null;
    boolean b22 = server20.connect(iP21);
    java.lang.String str23 = server20.toString();
    java.lang.String str24 = server20.toString();
    tp2.Entry entry25 = new tp2.Entry();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getFirst();
    java.lang.String str32 = iP30.toString();
    entry25.element = iP30;
    boolean b34 = server20.connect(iP30);
    boolean b35 = server11.removeException(iP30);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP37 = null;
    boolean b38 = server36.connect(iP37);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b44 = server36.connect(iP43);
    java.lang.Integer i45 = iP43.getFirst();
    boolean b46 = server11.connect(iP43);
    boolean b47 = server0.addException(iP43);
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    java.lang.Integer i53 = iP52.getFirst();
    java.lang.Integer i54 = iP52.getSecond();
    boolean b55 = server0.addBan(iP52);
    tp2.Server server56 = new tp2.Server();
    tp2.IP iP57 = null;
    boolean b58 = server56.connect(iP57);
    java.lang.String str59 = server56.toString();
    tp2.Server server60 = new tp2.Server();
    java.lang.String str61 = server60.toString();
    server60.update();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP67.setFirst((java.lang.Integer)1);
    java.lang.Integer i70 = iP67.getSecond();
    boolean b71 = server60.addException(iP67);
    boolean b72 = server56.addException(iP67);
    boolean b73 = server0.addBan(iP67);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    java.lang.String str4 = server0.toString();
    tp2.Entry entry5 = new tp2.Entry();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getFirst();
    java.lang.String str12 = iP10.toString();
    entry5.element = iP10;
    boolean b14 = server0.connect(iP10);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList15 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.Node node16 = strictlySortedSinglyLinkedList15.header;
    tp2.Node node17 = new tp2.Node();
    tp2.IPBan iPBan18 = null;
    node17.element = iPBan18;
    tp2.IPBan iPBan20 = null;
    node17.element = iPBan20;
    strictlySortedSinglyLinkedList15.header = node17;
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)0);
    boolean b28 = strictlySortedSinglyLinkedList15.containsIP(iP27);
    java.lang.Integer i29 = iP27.getFirst();
    boolean b30 = server0.addBan(iP27);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)100, (java.lang.Integer)0, (java.lang.Integer)0);
    boolean b8 = server0.addBan(iP7);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    java.lang.String str4 = server0.toString();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    tp2.Entry entry7 = new tp2.Entry();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getFirst();
    entry7.element = iP12;
    boolean b15 = server0.addException(iP12);
    tp2.Server server16 = new tp2.Server();
    tp2.IP iP17 = null;
    boolean b18 = server16.connect(iP17);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP23.setFirst((java.lang.Integer)1);
    boolean b26 = server16.removeException(iP23);
    tp2.Server server27 = new tp2.Server();
    tp2.IP iP28 = null;
    boolean b29 = server27.connect(iP28);
    tp2.IP iP34 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b35 = server27.connect(iP34);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList36 = new tp2.StrictlySortedSinglyLinkedList();
    strictlySortedSinglyLinkedList36.size = 10;
    tp2.Server server39 = new tp2.Server();
    java.lang.String str40 = server39.toString();
    server39.update();
    tp2.IP iP46 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP46.setFirst((java.lang.Integer)1);
    java.lang.Integer i49 = iP46.getSecond();
    boolean b50 = server39.addException(iP46);
    tp2.Entry entry51 = new tp2.Entry();
    tp2.IP iP56 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i57 = iP56.getFirst();
    java.lang.String str58 = iP56.toString();
    entry51.element = iP56;
    boolean b60 = server39.addException(iP56);
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b66 = server39.removeBan(iP65);
    iP65.setThird((java.lang.Integer)0);
    boolean b69 = strictlySortedSinglyLinkedList36.removeFromIP(iP65);
    tp2.Server server70 = new tp2.Server();
    java.lang.String str71 = server70.toString();
    server70.update();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP77.setFirst((java.lang.Integer)1);
    java.lang.Integer i80 = iP77.getSecond();
    boolean b81 = server70.addException(iP77);
    boolean b82 = strictlySortedSinglyLinkedList36.removeFromIP(iP77);
    boolean b83 = server27.connect(iP77);
    boolean b84 = server16.removeBan(iP77);
    java.lang.Integer i85 = iP77.getThird();
    boolean b86 = server0.addBan(iP77);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }


    tp2.Server server0 = new tp2.Server();
    java.lang.String str1 = server0.toString();
    server0.update();
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP7.setFirst((java.lang.Integer)1);
    java.lang.Integer i10 = iP7.getSecond();
    boolean b11 = server0.addException(iP7);
    tp2.Entry entry12 = new tp2.Entry();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i18 = iP17.getFirst();
    java.lang.String str19 = iP17.toString();
    entry12.element = iP17;
    boolean b21 = server0.addException(iP17);
    tp2.IP iP26 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b27 = server0.removeBan(iP26);
    tp2.Server server28 = new tp2.Server();
    tp2.IP iP29 = null;
    boolean b30 = server28.connect(iP29);
    tp2.IP iP35 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b36 = server28.connect(iP35);
    tp2.Server server37 = new tp2.Server();
    tp2.IP iP38 = null;
    boolean b39 = server37.connect(iP38);
    java.lang.String str40 = server37.toString();
    java.lang.String str41 = server37.toString();
    tp2.Entry entry42 = new tp2.Entry();
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i48 = iP47.getFirst();
    java.lang.String str49 = iP47.toString();
    entry42.element = iP47;
    boolean b51 = server37.connect(iP47);
    boolean b52 = server28.removeException(iP47);
    boolean b53 = server0.connect(iP47);
    tp2.IP iP58 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    iP58.setSecond((java.lang.Integer)1);
    boolean b61 = server0.removeBan(iP58);
    tp2.StubTime stubTime62 = new tp2.StubTime();
    long long63 = stubTime62.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime62);
    tp2.Entry entry65 = new tp2.Entry();
    tp2.IP iP70 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i71 = iP70.getFirst();
    java.lang.String str72 = iP70.toString();
    entry65.element = iP70;
    tp2.IP iP74 = entry65.element;
    tp2.Server server75 = new tp2.Server();
    tp2.IP iP76 = null;
    boolean b77 = server75.connect(iP76);
    java.lang.String str78 = server75.toString();
    tp2.Server server79 = new tp2.Server();
    java.lang.String str80 = server79.toString();
    server79.update();
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP86.setFirst((java.lang.Integer)1);
    java.lang.Integer i89 = iP86.getSecond();
    boolean b90 = server79.addException(iP86);
    boolean b91 = server75.addException(iP86);
    entry65.element = iP86;
    tp2.IP iP93 = entry65.element;
    boolean b94 = server0.removeException(iP93);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP7.setFirst((java.lang.Integer)1);
    boolean b10 = server0.removeException(iP7);
    tp2.Server server11 = new tp2.Server();
    java.lang.String str12 = server11.toString();
    server11.update();
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP18.setFirst((java.lang.Integer)1);
    java.lang.Integer i21 = iP18.getSecond();
    boolean b22 = server11.addException(iP18);
    boolean b23 = server0.removeBan(iP18);
    tp2.SinglyLinkedList singlyLinkedList24 = new tp2.SinglyLinkedList();
    java.lang.String str25 = singlyLinkedList24.toString();
    java.lang.String str26 = singlyLinkedList24.toString();
    boolean b27 = singlyLinkedList24.isEmpty();
    tp2.IP iP28 = null;
    boolean b29 = singlyLinkedList24.remove(iP28);
    boolean b30 = singlyLinkedList24.isEmpty();
    int i31 = singlyLinkedList24.getSize();
    tp2.Server server32 = new tp2.Server();
    tp2.IP iP33 = null;
    boolean b34 = server32.connect(iP33);
    tp2.Server server35 = new tp2.Server();
    java.lang.String str36 = server35.toString();
    server35.update();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP42.setFirst((java.lang.Integer)1);
    java.lang.Integer i45 = iP42.getSecond();
    boolean b46 = server35.addException(iP42);
    tp2.Entry entry47 = new tp2.Entry();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getFirst();
    java.lang.String str54 = iP52.toString();
    entry47.element = iP52;
    boolean b56 = server35.addException(iP52);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList57 = new tp2.StrictlySortedSinglyLinkedList();
    strictlySortedSinglyLinkedList57.size = 10;
    tp2.Server server60 = new tp2.Server();
    java.lang.String str61 = server60.toString();
    server60.update();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP67.setFirst((java.lang.Integer)1);
    java.lang.Integer i70 = iP67.getSecond();
    boolean b71 = server60.addException(iP67);
    tp2.Entry entry72 = new tp2.Entry();
    tp2.IP iP77 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i78 = iP77.getFirst();
    java.lang.String str79 = iP77.toString();
    entry72.element = iP77;
    boolean b81 = server60.addException(iP77);
    tp2.IP iP86 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b87 = server60.removeBan(iP86);
    iP86.setThird((java.lang.Integer)0);
    boolean b90 = strictlySortedSinglyLinkedList57.removeFromIP(iP86);
    boolean b91 = server35.addException(iP86);
    java.lang.String str92 = iP86.toString();
    boolean b93 = server32.removeBan(iP86);
    java.lang.Integer i94 = iP86.getThird();
    boolean b95 = singlyLinkedList24.contains(iP86);
    boolean b96 = server0.addBan(iP86);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b8 = server0.connect(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP10 = null;
    boolean b11 = server9.connect(iP10);
    tp2.IP iP16 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP16.setFirst((java.lang.Integer)1);
    boolean b19 = server9.removeException(iP16);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList20 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan21 = null;
    boolean b22 = strictlySortedSinglyLinkedList20.contains(iPBan21);
    int i23 = strictlySortedSinglyLinkedList20.getSize();
    tp2.IPBan iPBan25 = strictlySortedSinglyLinkedList20.get((int)'#');
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP30.setSecond((java.lang.Integer)(-1));
    boolean b33 = strictlySortedSinglyLinkedList20.removeFromIP(iP30);
    boolean b34 = server9.removeBan(iP30);
    tp2.SinglyLinkedList singlyLinkedList35 = new tp2.SinglyLinkedList();
    tp2.IP iP37 = singlyLinkedList35.get((int)' ');
    tp2.Entry entry38 = new tp2.Entry();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i44 = iP43.getFirst();
    java.lang.String str45 = iP43.toString();
    entry38.element = iP43;
    boolean b47 = singlyLinkedList35.remove(iP43);
    boolean b48 = iP30.equals((java.lang.Object)iP43);
    boolean b49 = server0.removeException(iP30);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP51 = null;
    boolean b52 = server50.connect(iP51);
    java.lang.String str53 = server50.toString();
    tp2.Server server54 = new tp2.Server();
    java.lang.String str55 = server54.toString();
    server54.update();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP61.setFirst((java.lang.Integer)1);
    java.lang.Integer i64 = iP61.getSecond();
    boolean b65 = server54.addException(iP61);
    boolean b66 = server50.addException(iP61);
    boolean b67 = server0.addBan(iP61);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.SinglyLinkedList singlyLinkedList3 = new tp2.SinglyLinkedList();
    tp2.IP iP5 = singlyLinkedList3.get((int)' ');
    tp2.Entry entry6 = new tp2.Entry();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i12 = iP11.getFirst();
    java.lang.String str13 = iP11.toString();
    entry6.element = iP11;
    boolean b15 = singlyLinkedList3.remove(iP11);
    tp2.IPBan iPBan17 = new tp2.IPBan(iP11, (java.lang.Long)1L);
    iPBan17.expires = 1466185871428L;
    tp2.Server server20 = new tp2.Server();
    tp2.IP iP21 = null;
    boolean b22 = server20.connect(iP21);
    java.lang.String str23 = server20.toString();
    java.lang.String str24 = server20.toString();
    tp2.Entry entry25 = new tp2.Entry();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getFirst();
    java.lang.String str32 = iP30.toString();
    entry25.element = iP30;
    boolean b34 = server20.connect(iP30);
    iPBan17.ip = iP30;
    boolean b36 = server0.addBan(iP30);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    tp2.Server server4 = new tp2.Server();
    tp2.IP iP5 = null;
    boolean b6 = server4.connect(iP5);
    java.lang.String str7 = server4.toString();
    java.lang.String str8 = server4.toString();
    tp2.Entry entry9 = new tp2.Entry();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFirst();
    java.lang.String str16 = iP14.toString();
    entry9.element = iP14;
    boolean b18 = server4.connect(iP14);
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getFirst();
    java.lang.String str25 = iP23.toString();
    java.lang.String str26 = iP23.toString();
    boolean b27 = server4.removeBan(iP23);
    iP23.setFirst((java.lang.Integer)10);
    boolean b30 = server0.removeException(iP23);
    tp2.IP iP31 = null;
    boolean b32 = server0.removeException(iP31);
    tp2.IP iP37 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i38 = iP37.getFirst();
    java.lang.Integer i39 = iP37.getSecond();
    boolean b40 = server0.addBan(iP37);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    java.lang.String str4 = server0.toString();
    tp2.Entry entry5 = new tp2.Entry();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getFirst();
    java.lang.String str12 = iP10.toString();
    entry5.element = iP10;
    boolean b14 = server0.connect(iP10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = singlyLinkedList15.get((int)' ');
    tp2.Entry entry18 = new tp2.Entry();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getFirst();
    java.lang.String str25 = iP23.toString();
    entry18.element = iP23;
    boolean b27 = singlyLinkedList15.remove(iP23);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP23, (java.lang.Long)1L);
    java.lang.String str30 = iPBan29.toString();
    iPBan29.setExpires((java.lang.Long)0L);
    java.lang.Long long33 = iPBan29.expires;
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP35 = null;
    boolean b36 = server34.connect(iP35);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b42 = server34.connect(iP41);
    java.lang.Integer i43 = iP41.getFirst();
    java.lang.Integer i44 = iP41.getFirst();
    iPBan29.setIp(iP41);
    boolean b46 = server0.removeException(iP41);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList47 = new tp2.StrictlySortedSinglyLinkedList();
    int i48 = strictlySortedSinglyLinkedList47.getSize();
    tp2.IP iP53 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)0);
    boolean b54 = strictlySortedSinglyLinkedList47.containsIP(iP53);
    boolean b55 = server0.addBan(iP53);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP5 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP5.setSecond((java.lang.Integer)(-1));
    boolean b8 = server0.addException(iP5);
    java.lang.String str9 = server0.toString();
    tp2.Server server10 = new tp2.Server();
    tp2.IP iP11 = null;
    boolean b12 = server10.connect(iP11);
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP17.setFirst((java.lang.Integer)1);
    boolean b20 = server10.removeException(iP17);
    tp2.SinglyLinkedList singlyLinkedList21 = new tp2.SinglyLinkedList();
    tp2.IP iP23 = singlyLinkedList21.get((int)' ');
    tp2.Entry entry24 = new tp2.Entry();
    tp2.IP iP29 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i30 = iP29.getFirst();
    java.lang.String str31 = iP29.toString();
    entry24.element = iP29;
    boolean b33 = singlyLinkedList21.remove(iP29);
    tp2.IPBan iPBan35 = new tp2.IPBan(iP29, (java.lang.Long)1L);
    java.lang.String str36 = iPBan35.toString();
    iPBan35.setExpires((java.lang.Long)0L);
    java.lang.Long long39 = iPBan35.expires;
    tp2.IP iP40 = iPBan35.ip;
    java.lang.String str41 = iPBan35.toString();
    tp2.IP iP42 = iPBan35.getIp();
    iP42.setFirst((java.lang.Integer)100);
    boolean b45 = server10.addException(iP42);
    tp2.IP iP50 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP50.setThird((java.lang.Integer)1);
    java.lang.Object obj53 = null;
    boolean b54 = iP50.equals(obj53);
    iP50.setThird((java.lang.Integer)0);
    boolean b57 = server10.removeException(iP50);
    boolean b58 = server0.addBan(iP50);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    java.lang.String str4 = server0.toString();
    tp2.Entry entry5 = new tp2.Entry();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getFirst();
    java.lang.String str12 = iP10.toString();
    entry5.element = iP10;
    boolean b14 = server0.connect(iP10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = singlyLinkedList15.get((int)' ');
    tp2.Entry entry18 = new tp2.Entry();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getFirst();
    java.lang.String str25 = iP23.toString();
    entry18.element = iP23;
    boolean b27 = singlyLinkedList15.remove(iP23);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP23, (java.lang.Long)1L);
    java.lang.String str30 = iPBan29.toString();
    iPBan29.setExpires((java.lang.Long)0L);
    java.lang.Long long33 = iPBan29.expires;
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP35 = null;
    boolean b36 = server34.connect(iP35);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b42 = server34.connect(iP41);
    java.lang.Integer i43 = iP41.getFirst();
    java.lang.Integer i44 = iP41.getFirst();
    iPBan29.setIp(iP41);
    boolean b46 = server0.removeException(iP41);
    tp2.Server server47 = new tp2.Server();
    tp2.IP iP48 = null;
    boolean b49 = server47.connect(iP48);
    tp2.IP iP54 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b55 = server47.connect(iP54);
    java.lang.Integer i56 = iP54.getFirst();
    java.lang.Integer i57 = iP54.getSecond();
    boolean b58 = server0.connect(iP54);
    java.lang.String str59 = server0.toString();
    tp2.Entry entry60 = new tp2.Entry();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getFirst();
    entry60.element = iP65;
    tp2.Entry entry68 = entry60.next;
    tp2.Server server69 = new tp2.Server();
    tp2.IP iP70 = null;
    boolean b71 = server69.connect(iP70);
    tp2.IP iP76 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b77 = server69.connect(iP76);
    java.lang.Integer i78 = iP76.getFirst();
    entry60.element = iP76;
    java.lang.Integer i80 = iP76.getThird();
    tp2.IPBan iPBan82 = new tp2.IPBan(iP76, (java.lang.Long)1466185883089L);
    boolean b83 = server0.addBan(iP76);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    java.lang.String str4 = server0.toString();
    tp2.Entry entry5 = new tp2.Entry();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getFirst();
    java.lang.String str12 = iP10.toString();
    entry5.element = iP10;
    boolean b14 = server0.connect(iP10);
    tp2.SinglyLinkedList singlyLinkedList15 = new tp2.SinglyLinkedList();
    tp2.IP iP17 = singlyLinkedList15.get((int)' ');
    tp2.Entry entry18 = new tp2.Entry();
    tp2.IP iP23 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i24 = iP23.getFirst();
    java.lang.String str25 = iP23.toString();
    entry18.element = iP23;
    boolean b27 = singlyLinkedList15.remove(iP23);
    tp2.IPBan iPBan29 = new tp2.IPBan(iP23, (java.lang.Long)1L);
    java.lang.String str30 = iPBan29.toString();
    iPBan29.setExpires((java.lang.Long)0L);
    java.lang.Long long33 = iPBan29.expires;
    tp2.Server server34 = new tp2.Server();
    tp2.IP iP35 = null;
    boolean b36 = server34.connect(iP35);
    tp2.IP iP41 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b42 = server34.connect(iP41);
    java.lang.Integer i43 = iP41.getFirst();
    java.lang.Integer i44 = iP41.getFirst();
    iPBan29.setIp(iP41);
    boolean b46 = server0.removeException(iP41);
    tp2.Entry entry47 = new tp2.Entry();
    tp2.IP iP52 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i53 = iP52.getFirst();
    java.lang.String str54 = iP52.toString();
    entry47.element = iP52;
    tp2.Node node56 = new tp2.Node();
    tp2.IPBan iPBan57 = null;
    node56.element = iPBan57;
    tp2.SinglyLinkedList singlyLinkedList59 = new tp2.SinglyLinkedList();
    tp2.IP iP61 = singlyLinkedList59.get((int)' ');
    tp2.Entry entry62 = new tp2.Entry();
    tp2.IP iP67 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i68 = iP67.getFirst();
    java.lang.String str69 = iP67.toString();
    entry62.element = iP67;
    boolean b71 = singlyLinkedList59.remove(iP67);
    tp2.IPBan iPBan73 = new tp2.IPBan(iP67, (java.lang.Long)1L);
    java.lang.String str74 = iPBan73.toString();
    tp2.IP iP79 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i80 = iP79.getFirst();
    java.lang.String str81 = iP79.toString();
    java.lang.String str82 = iP79.toString();
    iPBan73.setIp(iP79);
    java.lang.Long long84 = iPBan73.getExpires();
    node56.element = iPBan73;
    boolean b86 = iP52.equals((java.lang.Object)iPBan73);
    iP52.setThird((java.lang.Integer)11);
    boolean b89 = server0.removeException(iP52);
    tp2.IP iP94 = new tp2.IP((java.lang.Integer)0, (java.lang.Integer)10, (java.lang.Integer)32, (java.lang.Integer)32);
    boolean b95 = server0.addBan(iP94);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b8 = server0.connect(iP7);
    tp2.Server server9 = new tp2.Server();
    tp2.IP iP10 = null;
    boolean b11 = server9.connect(iP10);
    java.lang.String str12 = server9.toString();
    java.lang.String str13 = server9.toString();
    tp2.Entry entry14 = new tp2.Entry();
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getFirst();
    java.lang.String str21 = iP19.toString();
    entry14.element = iP19;
    boolean b23 = server9.connect(iP19);
    boolean b24 = server0.removeException(iP19);
    tp2.Server server25 = new tp2.Server();
    tp2.IP iP26 = null;
    boolean b27 = server25.connect(iP26);
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)1);
    boolean b35 = server25.removeException(iP32);
    tp2.Server server36 = new tp2.Server();
    java.lang.String str37 = server36.toString();
    server36.update();
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP43.setFirst((java.lang.Integer)1);
    java.lang.Integer i46 = iP43.getSecond();
    boolean b47 = server36.addException(iP43);
    boolean b48 = server25.removeBan(iP43);
    boolean b49 = server0.addBan(iP43);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    java.lang.String str4 = server0.toString();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    tp2.Entry entry7 = new tp2.Entry();
    tp2.IP iP12 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i13 = iP12.getFirst();
    entry7.element = iP12;
    boolean b15 = server0.addException(iP12);
    tp2.Entry entry16 = new tp2.Entry();
    tp2.Entry entry17 = new tp2.Entry();
    java.lang.String str18 = entry17.toString();
    java.lang.String str19 = entry17.toString();
    tp2.Entry entry20 = entry17.next;
    entry16.next = entry17;
    tp2.Entry entry22 = new tp2.Entry();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getFirst();
    entry22.element = iP27;
    tp2.Entry entry30 = entry22.next;
    tp2.Server server31 = new tp2.Server();
    tp2.IP iP32 = null;
    boolean b33 = server31.connect(iP32);
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b39 = server31.connect(iP38);
    java.lang.Integer i40 = iP38.getFirst();
    entry22.element = iP38;
    entry17.next = entry22;
    tp2.Entry entry43 = new tp2.Entry();
    java.lang.String str44 = entry43.toString();
    java.lang.String str45 = entry43.toString();
    tp2.Entry entry46 = entry43.next;
    entry22.next = entry46;
    tp2.IP iP48 = entry22.element;
    boolean b49 = server0.removeException(iP48);
    tp2.Server server50 = new tp2.Server();
    tp2.IP iP51 = null;
    boolean b52 = server50.connect(iP51);
    tp2.IP iP57 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP57.setFirst((java.lang.Integer)1);
    boolean b60 = server50.removeException(iP57);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList61 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan62 = null;
    boolean b63 = strictlySortedSinglyLinkedList61.contains(iPBan62);
    int i64 = strictlySortedSinglyLinkedList61.getSize();
    tp2.IPBan iPBan66 = strictlySortedSinglyLinkedList61.get((int)'#');
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP71.setSecond((java.lang.Integer)(-1));
    boolean b74 = strictlySortedSinglyLinkedList61.removeFromIP(iP71);
    boolean b75 = server50.removeBan(iP71);
    tp2.SinglyLinkedList singlyLinkedList76 = new tp2.SinglyLinkedList();
    tp2.IP iP78 = singlyLinkedList76.get((int)' ');
    tp2.Entry entry79 = new tp2.Entry();
    tp2.IP iP84 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i85 = iP84.getFirst();
    java.lang.String str86 = iP84.toString();
    entry79.element = iP84;
    boolean b88 = singlyLinkedList76.remove(iP84);
    boolean b89 = iP71.equals((java.lang.Object)iP84);
    iP84.setFirst((java.lang.Integer)1);
    boolean b92 = server0.addBan(iP84);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    java.lang.String str4 = server0.toString();
    tp2.Entry entry5 = new tp2.Entry();
    tp2.IP iP10 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i11 = iP10.getFirst();
    java.lang.String str12 = iP10.toString();
    entry5.element = iP10;
    boolean b14 = server0.connect(iP10);
    tp2.IP iP19 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i20 = iP19.getFirst();
    java.lang.String str21 = iP19.toString();
    java.lang.String str22 = iP19.toString();
    boolean b23 = server0.removeBan(iP19);
    server0.update();
    tp2.StubTime stubTime25 = new tp2.StubTime();
    long long26 = stubTime25.getCurrentTime();
    server0.setTime((tp2.ITime)stubTime25);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList28 = new tp2.StrictlySortedSinglyLinkedList();
    tp2.IPBan iPBan29 = null;
    boolean b30 = strictlySortedSinglyLinkedList28.contains(iPBan29);
    tp2.Server server31 = new tp2.Server();
    java.lang.String str32 = server31.toString();
    server31.update();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    java.lang.Integer i39 = iP38.getFirst();
    boolean b40 = server31.connect(iP38);
    boolean b41 = strictlySortedSinglyLinkedList28.removeFromIP(iP38);
    boolean b42 = server0.addException(iP38);
    tp2.IP iP47 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    tp2.IPBan iPBan49 = new tp2.IPBan(iP47, (java.lang.Long)(-1L));
    boolean b50 = server0.connect(iP47);
    tp2.Server server51 = new tp2.Server();
    tp2.IP iP52 = null;
    boolean b53 = server51.connect(iP52);
    java.lang.String str54 = server51.toString();
    java.lang.String str55 = server51.toString();
    tp2.Entry entry56 = new tp2.Entry();
    tp2.IP iP61 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i62 = iP61.getFirst();
    java.lang.String str63 = iP61.toString();
    entry56.element = iP61;
    boolean b65 = server51.connect(iP61);
    iP61.setFirst((java.lang.Integer)0);
    tp2.IPBan iPBan69 = new tp2.IPBan(iP61, (java.lang.Long)0L);
    iP61.setThird((java.lang.Integer)2);
    boolean b72 = server0.addBan(iP61);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    tp2.Server server4 = new tp2.Server();
    java.lang.String str5 = server4.toString();
    server4.update();
    tp2.IP iP11 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP11.setFirst((java.lang.Integer)1);
    java.lang.Integer i14 = iP11.getSecond();
    boolean b15 = server4.addException(iP11);
    boolean b16 = server0.addException(iP11);
    tp2.IP iP21 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    iP21.setSecond((java.lang.Integer)1);
    boolean b24 = server0.addException(iP21);
    tp2.Server server25 = new tp2.Server();
    java.lang.String str26 = server25.toString();
    server25.update();
    tp2.IP iP32 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP32.setFirst((java.lang.Integer)1);
    java.lang.Integer i35 = iP32.getSecond();
    boolean b36 = server25.addException(iP32);
    tp2.Entry entry37 = new tp2.Entry();
    tp2.IP iP42 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i43 = iP42.getFirst();
    java.lang.String str44 = iP42.toString();
    entry37.element = iP42;
    boolean b46 = server25.addException(iP42);
    tp2.IP iP51 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b52 = server25.removeBan(iP51);
    tp2.Server server53 = new tp2.Server();
    tp2.IP iP54 = null;
    boolean b55 = server53.connect(iP54);
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b61 = server53.connect(iP60);
    tp2.Server server62 = new tp2.Server();
    tp2.IP iP63 = null;
    boolean b64 = server62.connect(iP63);
    java.lang.String str65 = server62.toString();
    java.lang.String str66 = server62.toString();
    tp2.Entry entry67 = new tp2.Entry();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getFirst();
    java.lang.String str74 = iP72.toString();
    entry67.element = iP72;
    boolean b76 = server62.connect(iP72);
    boolean b77 = server53.removeException(iP72);
    boolean b78 = server25.connect(iP72);
    java.lang.Integer i79 = iP72.getFirst();
    iP72.setSecond((java.lang.Integer)0);
    java.lang.Integer i82 = iP72.getThird();
    tp2.IPBan iPBan84 = new tp2.IPBan(iP72, (java.lang.Long)1466185872784L);
    boolean b85 = server0.addBan(iP72);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    tp2.IP iP7 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP7.setFirst((java.lang.Integer)1);
    boolean b10 = server0.removeException(iP7);
    tp2.Server server11 = new tp2.Server();
    tp2.IP iP12 = null;
    boolean b13 = server11.connect(iP12);
    tp2.IP iP18 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b19 = server11.connect(iP18);
    tp2.Server server20 = new tp2.Server();
    tp2.IP iP21 = null;
    boolean b22 = server20.connect(iP21);
    java.lang.String str23 = server20.toString();
    java.lang.String str24 = server20.toString();
    tp2.Entry entry25 = new tp2.Entry();
    tp2.IP iP30 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i31 = iP30.getFirst();
    java.lang.String str32 = iP30.toString();
    entry25.element = iP30;
    boolean b34 = server20.connect(iP30);
    boolean b35 = server11.removeException(iP30);
    tp2.Server server36 = new tp2.Server();
    tp2.IP iP37 = null;
    boolean b38 = server36.connect(iP37);
    tp2.IP iP43 = new tp2.IP((java.lang.Integer)100, (java.lang.Integer)10, (java.lang.Integer)(-1), (java.lang.Integer)10);
    boolean b44 = server36.connect(iP43);
    java.lang.Integer i45 = iP43.getFirst();
    boolean b46 = server11.connect(iP43);
    boolean b47 = server0.addException(iP43);
    tp2.RealTime realTime48 = new tp2.RealTime();
    long long49 = realTime48.getCurrentTime();
    long long50 = realTime48.getCurrentTime();
    server0.setTime((tp2.ITime)realTime48);
    tp2.SinglyLinkedList singlyLinkedList52 = new tp2.SinglyLinkedList();
    tp2.IP iP54 = singlyLinkedList52.get((int)' ');
    tp2.Entry entry55 = new tp2.Entry();
    tp2.IP iP60 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i61 = iP60.getFirst();
    java.lang.String str62 = iP60.toString();
    entry55.element = iP60;
    boolean b64 = singlyLinkedList52.remove(iP60);
    boolean b65 = server0.addException(iP60);
    java.lang.String str66 = server0.toString();
    tp2.IP iP71 = new tp2.IP((java.lang.Integer)2, (java.lang.Integer)0, (java.lang.Integer)32, (java.lang.Integer)32);
    boolean b72 = server0.addBan(iP71);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    java.lang.String str4 = server0.toString();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    strictlySortedSinglyLinkedList7.size = 10;
    tp2.Server server10 = new tp2.Server();
    java.lang.String str11 = server10.toString();
    server10.update();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP17.setFirst((java.lang.Integer)1);
    java.lang.Integer i20 = iP17.getSecond();
    boolean b21 = server10.addException(iP17);
    tp2.Entry entry22 = new tp2.Entry();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getFirst();
    java.lang.String str29 = iP27.toString();
    entry22.element = iP27;
    boolean b31 = server10.addException(iP27);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b37 = server10.removeBan(iP36);
    iP36.setThird((java.lang.Integer)0);
    boolean b40 = strictlySortedSinglyLinkedList7.removeFromIP(iP36);
    tp2.Server server41 = new tp2.Server();
    java.lang.String str42 = server41.toString();
    server41.update();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP48.setFirst((java.lang.Integer)1);
    java.lang.Integer i51 = iP48.getSecond();
    boolean b52 = server41.addException(iP48);
    boolean b53 = strictlySortedSinglyLinkedList7.removeFromIP(iP48);
    boolean b54 = server0.connect(iP48);
    tp2.Server server55 = new tp2.Server();
    java.lang.String str56 = server55.toString();
    server55.update();
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP62.setFirst((java.lang.Integer)1);
    java.lang.Integer i65 = iP62.getSecond();
    boolean b66 = server55.addException(iP62);
    tp2.Entry entry67 = new tp2.Entry();
    tp2.IP iP72 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i73 = iP72.getFirst();
    java.lang.String str74 = iP72.toString();
    entry67.element = iP72;
    boolean b76 = server55.addException(iP72);
    tp2.IP iP81 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b82 = server55.removeBan(iP81);
    iP81.setThird((java.lang.Integer)0);
    iP81.setFourth((java.lang.Integer)10);
    boolean b87 = server0.addException(iP81);
    tp2.RealTime realTime88 = new tp2.RealTime();
    long long89 = realTime88.getCurrentTime();
    server0.setTime((tp2.ITime)realTime88);
    tp2.IP iP95 = new tp2.IP((java.lang.Integer)1, (java.lang.Integer)0, (java.lang.Integer)(-1), (java.lang.Integer)2);
    boolean b96 = server0.addBan(iP95);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test31"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    java.lang.String str4 = server0.toString();
    tp2.IP iP5 = null;
    boolean b6 = server0.removeException(iP5);
    tp2.StrictlySortedSinglyLinkedList strictlySortedSinglyLinkedList7 = new tp2.StrictlySortedSinglyLinkedList();
    strictlySortedSinglyLinkedList7.size = 10;
    tp2.Server server10 = new tp2.Server();
    java.lang.String str11 = server10.toString();
    server10.update();
    tp2.IP iP17 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP17.setFirst((java.lang.Integer)1);
    java.lang.Integer i20 = iP17.getSecond();
    boolean b21 = server10.addException(iP17);
    tp2.Entry entry22 = new tp2.Entry();
    tp2.IP iP27 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i28 = iP27.getFirst();
    java.lang.String str29 = iP27.toString();
    entry22.element = iP27;
    boolean b31 = server10.addException(iP27);
    tp2.IP iP36 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)100, (java.lang.Integer)(-1), (java.lang.Integer)1);
    boolean b37 = server10.removeBan(iP36);
    iP36.setThird((java.lang.Integer)0);
    boolean b40 = strictlySortedSinglyLinkedList7.removeFromIP(iP36);
    tp2.Server server41 = new tp2.Server();
    java.lang.String str42 = server41.toString();
    server41.update();
    tp2.IP iP48 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    iP48.setFirst((java.lang.Integer)1);
    java.lang.Integer i51 = iP48.getSecond();
    boolean b52 = server41.addException(iP48);
    boolean b53 = strictlySortedSinglyLinkedList7.removeFromIP(iP48);
    boolean b54 = server0.connect(iP48);
    tp2.IP iP55 = null;
    boolean b56 = server0.connect(iP55);
    tp2.SinglyLinkedList singlyLinkedList57 = new tp2.SinglyLinkedList();
    tp2.IP iP59 = singlyLinkedList57.get((int)' ');
    tp2.Entry entry60 = new tp2.Entry();
    tp2.IP iP65 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i66 = iP65.getFirst();
    java.lang.String str67 = iP65.toString();
    entry60.element = iP65;
    boolean b69 = singlyLinkedList57.remove(iP65);
    tp2.IPBan iPBan71 = new tp2.IPBan(iP65, (java.lang.Long)1L);
    iPBan71.expires = 1466185871428L;
    iPBan71.expires = 0L;
    tp2.IP iP76 = iPBan71.getIp();
    tp2.IP iP77 = iPBan71.getIp();
    boolean b78 = server0.addBan(iP77);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test32"); }


    tp2.Server server0 = new tp2.Server();
    tp2.IP iP1 = null;
    boolean b2 = server0.connect(iP1);
    java.lang.String str3 = server0.toString();
    java.lang.String str4 = server0.toString();
    server0.update();
    tp2.SinglyLinkedList singlyLinkedList6 = new tp2.SinglyLinkedList();
    tp2.IP iP8 = singlyLinkedList6.get((int)' ');
    tp2.Entry entry9 = new tp2.Entry();
    tp2.IP iP14 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i15 = iP14.getFirst();
    java.lang.String str16 = iP14.toString();
    entry9.element = iP14;
    boolean b18 = singlyLinkedList6.remove(iP14);
    tp2.IPBan iPBan20 = new tp2.IPBan(iP14, (java.lang.Long)1L);
    java.lang.String str21 = iPBan20.toString();
    iPBan20.setExpires((java.lang.Long)0L);
    java.lang.Long long24 = iPBan20.expires;
    tp2.IP iP25 = iPBan20.ip;
    java.lang.String str26 = iPBan20.toString();
    tp2.IP iP27 = iPBan20.getIp();
    iP27.setFirst((java.lang.Integer)100);
    tp2.SinglyLinkedList singlyLinkedList30 = new tp2.SinglyLinkedList();
    tp2.IP iP32 = singlyLinkedList30.get((int)' ');
    tp2.Entry entry33 = new tp2.Entry();
    tp2.IP iP38 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i39 = iP38.getFirst();
    java.lang.String str40 = iP38.toString();
    entry33.element = iP38;
    boolean b42 = singlyLinkedList30.remove(iP38);
    tp2.IP iP44 = singlyLinkedList30.get((int)'4');
    tp2.IP iP49 = new tp2.IP((java.lang.Integer)10, (java.lang.Integer)0, (java.lang.Integer)0, (java.lang.Integer)100);
    java.lang.Integer i50 = iP49.getFirst();
    java.lang.String str51 = iP49.toString();
    java.lang.String str52 = iP49.toString();
    iP49.setThird((java.lang.Integer)(-1));
    boolean b55 = singlyLinkedList30.contains(iP49);
    boolean b56 = iP27.equals((java.lang.Object)b55);
    boolean b57 = server0.addBan(iP27);
    tp2.IP iP62 = new tp2.IP((java.lang.Integer)11, (java.lang.Integer)0, (java.lang.Integer)1, (java.lang.Integer)2);
    boolean b63 = server0.addBan(iP62);
    
    // Check representation invariant.
    org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for server0", server0.repOK());

  }

}
