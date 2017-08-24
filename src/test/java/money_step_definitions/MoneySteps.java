/*
 * COPYRIGHT. HSBC HOLDINGS PLC 2017. ALL RIGHTS RESERVED.
 * 
 * This software is only to be used for the purpose for which it has been
 * provided. No part of it is to be reproduced, disassembled, transmitted,
 * stored in a retrieval system nor translated in any human or computer
 * language in any way or for any other purposes whatsoever without the prior
 * written consent of HSBC Holdings plc.
 */
package money_step_definitions;


import org.junit.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * <p>
 * <b> TODO : Insert description of the class's responsibility/role. </b>
 * </p>
 */
public class MoneySteps {
    private int accountBalance;
    private int withdrawAmount;
    private int receivedAmount;
    private int remainingBalance;

    @Before
    public void init() {
        this.accountBalance = 0;
        this.withdrawAmount = 0;
        this.receivedAmount = 0;
        this.receivedAmount = 0;
    }

    @Given("^accountBalance \"([^\"]*)\" yuan$")
    public void accountbalance_yuan(final int arg1) throws Throwable {
    	accountBalance = arg1;
//        System.out.print("accountBalance " + arg1 + " yuan .");
    }

    @When("^takeOut \"([^\"]*)\" yuan$")
    public void takeout_yuan(final int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.withdrawAmount = arg1;
//        System.out.print("withdrawAmount " + arg1 + " yuan .");

    }

    @Then("^receivedAmount \"([^\"]*)\" yuan$")
    public void receivedamount_yuan(final int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.receivedAmount = arg1;
//        System.out.print("withdrawAmount " + arg1 + " yuan .");
    	Assert.assertEquals(receivedAmount,withdrawAmount);
    	
    }

    @Then("^remainingBalance \"([^\"]*)\" yuan$")
    public void remainingbalance_yuan(final int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	remainingBalance = arg1 ;
//        System.out.print("remainingBalance " + arg1 + " yuan .");
        Assert.assertEquals(remainingBalance, accountBalance - withdrawAmount);
    }

}
