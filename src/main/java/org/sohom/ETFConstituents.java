package org.sohom;

import java.math.BigDecimal;
import java.util.Date;

public class ETFConstituents {

    String CUSIP;
    String ISIN;
    String NSCCPortfolioID;
    Date PortfolioTradeDate;
    int ComponentIDCode;
    String ComponentID;
    BigDecimal ComponentQuantity;
    String SignForComponentQuantity;
    String NewSecurityIndicator;
    String CashInLieuIndicator;
    String ComponentSymbol;
    String ComponentWIIndicator;
    String ComponentUndergoingCorporateAction;
    int SettlementLocation;
    String ComponentCNSIndicator;
    Date ExternalSettlementDate;
    String ComponentDescription;
    String WhenIssuedIndicator;
    long AccruedInterestNonstandardSettlement;
    long AccruedInterestStandardSettlement;
    String AssetClass;
    BigDecimal ExcludedFromPricing;
    BigDecimal Price;
    String LocalCurrency;
    BigDecimal Factor;
    String SyntheticsLocalCurrency;
    BigDecimal SyntheticsPriceMultiplier;
    BigDecimal SyntheticsContractSize;
    BigDecimal SyntheticsAverageContractOpenPrice;
    String FXRatesBaseCurrency;
    String FXRatesCurrencies;
    String FXForwardsCurrencyPair;
    Date FXForwardsValueDate;
    int FXForwardsQuantity;
    int FXForwardsRate;
    int FXForwardsValue;
    String FXForwardsCurrency;
    int SWAPsNotionalValue;
    int SWAPsSpread;
    int SWAPsMarketValue;
    String FutureUse;


    public String getCUSIP() {
        return CUSIP;
    }

    public void setCUSIP(String CUSIP) {
        this.CUSIP = CUSIP;
    }

    public String getISIN() {
        return ISIN;
    }

    public void setISIN(String ISIN) {
        this.ISIN = ISIN;
    }

    public String getNSCCPortfolioID() {
        return NSCCPortfolioID;
    }

    public void setNSCCPortfolioID(String NSCCPortfolioID) {
        this.NSCCPortfolioID = NSCCPortfolioID;
    }

    public Date getPortfolioTradeDate() {
        return PortfolioTradeDate;
    }

    public void setPortfolioTradeDate(Date portfolioTradeDate) {
        PortfolioTradeDate = portfolioTradeDate;
    }

    public int getComponentIDCode() {
        return ComponentIDCode;
    }

    public void setComponentIDCode(int componentIDCode) {
        ComponentIDCode = componentIDCode;
    }

    public String getComponentID() {
        return ComponentID;
    }

    public void setComponentID(String componentID) {
        ComponentID = componentID;
    }

    public BigDecimal getComponentQuantity() {
        return ComponentQuantity;
    }

    public void setComponentQuantity(BigDecimal componentQuantity) {
        ComponentQuantity = componentQuantity;
    }

    public String getSignForComponentQuantity() {
        return SignForComponentQuantity;
    }

    public void setSignForComponentQuantity(String signForComponentQuantity) {
        SignForComponentQuantity = signForComponentQuantity;
    }

    public String getNewSecurityIndicator() {
        return NewSecurityIndicator;
    }

    public void setNewSecurityIndicator(String newSecurityIndicator) {
        NewSecurityIndicator = newSecurityIndicator;
    }

    public String getCashInLieuIndicator() {
        return CashInLieuIndicator;
    }

    public void setCashInLieuIndicator(String cashInLieuIndicator) {
        CashInLieuIndicator = cashInLieuIndicator;
    }

    public String getComponentSymbol() {
        return ComponentSymbol;
    }

    public void setComponentSymbol(String componentSymbol) {
        ComponentSymbol = componentSymbol;
    }

    public String getComponentWIIndicator() {
        return ComponentWIIndicator;
    }

    public void setComponentWIIndicator(String componentWIIndicator) {
        ComponentWIIndicator = componentWIIndicator;
    }

    public String getComponentUndergoingCorporateAction() {
        return ComponentUndergoingCorporateAction;
    }

    public void setComponentUndergoingCorporateAction(String componentUndergoingCorporateAction) {
        ComponentUndergoingCorporateAction = componentUndergoingCorporateAction;
    }

    public int getSettlementLocation() {
        return SettlementLocation;
    }

    public void setSettlementLocation(int settlementLocation) {
        SettlementLocation = settlementLocation;
    }

    public String getComponentCNSIndicator() {
        return ComponentCNSIndicator;
    }

    public void setComponentCNSIndicator(String componentCNSIndicator) {
        ComponentCNSIndicator = componentCNSIndicator;
    }

    public Date getExternalSettlementDate() {
        return ExternalSettlementDate;
    }

    public void setExternalSettlementDate(Date externalSettlementDate) {
        ExternalSettlementDate = externalSettlementDate;
    }

    public String getComponentDescription() {
        return ComponentDescription;
    }

    public void setComponentDescription(String componentDescription) {
        ComponentDescription = componentDescription;
    }

    public String getWhenIssuedIndicator() {
        return WhenIssuedIndicator;
    }

    public void setWhenIssuedIndicator(String whenIssuedIndicator) {
        WhenIssuedIndicator = whenIssuedIndicator;
    }

    public long getAccruedInterestNonstandardSettlement() {
        return AccruedInterestNonstandardSettlement;
    }

    public void setAccruedInterestNonstandardSettlement(long accruedInterestNonstandardSettlement) {
        AccruedInterestNonstandardSettlement = accruedInterestNonstandardSettlement;
    }

    public long getAccruedInterestStandardSettlement() {
        return AccruedInterestStandardSettlement;
    }

    public void setAccruedInterestStandardSettlement(long accruedInterestStandardSettlement) {
        AccruedInterestStandardSettlement = accruedInterestStandardSettlement;
    }

    public String getAssetClass() {
        return AssetClass;
    }

    public void setAssetClass(String assetClass) {
        AssetClass = assetClass;
    }

    public BigDecimal getExcludedFromPricing() {
        return ExcludedFromPricing;
    }

    public void setExcludedFromPricing(BigDecimal excludedFromPricing) {
        ExcludedFromPricing = excludedFromPricing;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public String getLocalCurrency() {
        return LocalCurrency;
    }

    public void setLocalCurrency(String localCurrency) {
        LocalCurrency = localCurrency;
    }

    public BigDecimal getFactor() {
        return Factor;
    }

    public void setFactor(BigDecimal factor) {
        Factor = factor;
    }

    public String getSyntheticsLocalCurrency() {
        return SyntheticsLocalCurrency;
    }

    public void setSyntheticsLocalCurrency(String syntheticsLocalCurrency) {
        SyntheticsLocalCurrency = syntheticsLocalCurrency;
    }

    public BigDecimal getSyntheticsPriceMultiplier() {
        return SyntheticsPriceMultiplier;
    }

    public void setSyntheticsPriceMultiplier(BigDecimal syntheticsPriceMultiplier) {
        SyntheticsPriceMultiplier = syntheticsPriceMultiplier;
    }

    public BigDecimal getSyntheticsContractSize() {
        return SyntheticsContractSize;
    }

    public void setSyntheticsContractSize(BigDecimal syntheticsContractSize) {
        SyntheticsContractSize = syntheticsContractSize;
    }

    public BigDecimal getSyntheticsAverageContractOpenPrice() {
        return SyntheticsAverageContractOpenPrice;
    }

    public void setSyntheticsAverageContractOpenPrice(BigDecimal syntheticsAverageContractOpenPrice) {
        SyntheticsAverageContractOpenPrice = syntheticsAverageContractOpenPrice;
    }

    public String getFXRatesBaseCurrency() {
        return FXRatesBaseCurrency;
    }

    public void setFXRatesBaseCurrency(String FXRatesBaseCurrency) {
        this.FXRatesBaseCurrency = FXRatesBaseCurrency;
    }

    public String getFXRatesCurrencies() {
        return FXRatesCurrencies;
    }

    public void setFXRatesCurrencies(String FXRatesCurrencies) {
        this.FXRatesCurrencies = FXRatesCurrencies;
    }

    public String getFXForwardsCurrencyPair() {
        return FXForwardsCurrencyPair;
    }

    public void setFXForwardsCurrencyPair(String FXForwardsCurrencyPair) {
        this.FXForwardsCurrencyPair = FXForwardsCurrencyPair;
    }

    public Date getFXForwardsValueDate() {
        return FXForwardsValueDate;
    }

    public void setFXForwardsValueDate(Date FXForwardsValueDate) {
        this.FXForwardsValueDate = FXForwardsValueDate;
    }

    public int getFXForwardsQuantity() {
        return FXForwardsQuantity;
    }

    public void setFXForwardsQuantity(int FXForwardsQuantity) {
        this.FXForwardsQuantity = FXForwardsQuantity;
    }

    public int getFXForwardsRate() {
        return FXForwardsRate;
    }

    public void setFXForwardsRate(int FXForwardsRate) {
        this.FXForwardsRate = FXForwardsRate;
    }

    public int getFXForwardsValue() {
        return FXForwardsValue;
    }

    public void setFXForwardsValue(int FXForwardsValue) {
        this.FXForwardsValue = FXForwardsValue;
    }

    public String getFXForwardsCurrency() {
        return FXForwardsCurrency;
    }

    public void setFXForwardsCurrency(String FXForwardsCurrency) {
        this.FXForwardsCurrency = FXForwardsCurrency;
    }

    public int getSWAPsNotionalValue() {
        return SWAPsNotionalValue;
    }

    public void setSWAPsNotionalValue(int SWAPsNotionalValue) {
        this.SWAPsNotionalValue = SWAPsNotionalValue;
    }

    public int getSWAPsSpread() {
        return SWAPsSpread;
    }

    public void setSWAPsSpread(int SWAPsSpread) {
        this.SWAPsSpread = SWAPsSpread;
    }

    public int getSWAPsMarketValue() {
        return SWAPsMarketValue;
    }

    public void setSWAPsMarketValue(int SWAPsMarketValue) {
        this.SWAPsMarketValue = SWAPsMarketValue;
    }

    public String getFutureUse() {
        return FutureUse;
    }

    public void setFutureUse(String futureUse) {
        FutureUse = futureUse;
    }

}
