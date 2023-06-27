package org.sohom.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class ETF {
    ArrayList<ETFConstituents> constituents = new ArrayList<>();

    String recordType;
    String CUSIP;
    String ISIN;
    String NSCCPortfolioID;
    String Description;
    Date TradeDate;
    String ETFAgent;
    int ComponentCount;
    long EstCashAmountPerCreationTminus1;
    String SignForEstCashAmountPerCreationTminus1;
    BigDecimal NetAssetValuePerCreationUnit;
    String SignForNetAssetValuePerCreationUnit;
    long EstimatedCashAmountPerETFT_1;
    String SignForEstimatedCashAmountPerETFT_1;
    BigDecimal NetAssetValuePerETF;
    String SignForNetAssetValuePerETF;
    long TotalCashAmountPerCreationUnit;
    String SignForTotalCashAmountPerCreationUnit;

    long TotalSharesOutstandingPerETF;
    long DividendAmountPerETFT_1;
    String SignForDividendAmountPerETFT_1;
    long EstValueCashInLieuComponentsPerCreationUnit;
    String CashOnlyIndicator;
    int ETFExpenseRatioOnT_1;
    BigDecimal TotalNetAssetValueETFFundT_1;
    int ETFSharesPerCreateRedeemUnit;
    String ETFSymbol;
    String CNSEligibilityIndicator;
    String ETFCreateRedeemIdentifier;
    String PriorDayPortfolioBeingUsed;
    int  BasketType;
    String ForeignOrDomestic;
    String NSCCNewPortfolio;
    String ETFClassificationCode;
    int ETFBasketUnitSize;
    int VariableFees;
    long BabyBondCashValue;
    long FixedIncomeFaceValueAdjustment;
    int AssetClassificationCodeUnderlyingComponents;
    int LeverageIndicatorCode;
    int LeverageFactor;
    int TransferAgentID;
    String TransferAgentName;
    String FundLEI;
    BigDecimal FundSize;
    int ShareClassApportionmentRatio;
    int ProjectedTransactionFee;
    Date DateForProjectedTransactionFee;
    int ConfirmedTransactionFee;
    Date DateForConfirmedTransactionFee;
    long ProjectedCashForPricingBasket;
    int BasketsOutstanding;
    String PricingUsageIndicator;
    String CreationOrderUsage;
    String RedemptionOrderUsage;
    String FutureUse;

    public ArrayList<ETFConstituents> getConstituents() {
        return constituents;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public void addConstituents(ETFConstituents constituents) {
        this.constituents.add(constituents);
    }

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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getTradeDate() {
        return TradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        TradeDate = tradeDate;
    }

    public String getETFAgent() {
        return ETFAgent;
    }

    public void setETFAgent(String ETFAgent) {
        this.ETFAgent = ETFAgent;
    }

    public int getComponentCount() {
        return ComponentCount;
    }

    public void setComponentCount(int componentCount) {
        ComponentCount = componentCount;
    }

    public long getEstCashAmountPerCreationTminus1() {
        return EstCashAmountPerCreationTminus1;
    }

    public void setEstCashAmountPerCreationTminus1(long estCashAmountPerCreationTminus1) {
        EstCashAmountPerCreationTminus1 = estCashAmountPerCreationTminus1;
    }

    public String getSignForEstCashAmountPerCreationTminus1() {
        return SignForEstCashAmountPerCreationTminus1;
    }

    public void setSignForEstCashAmountPerCreationTminus1(String signForEstCashAmountPerCreationTminus1) {
        SignForEstCashAmountPerCreationTminus1 = signForEstCashAmountPerCreationTminus1;
    }

    public BigDecimal getNetAssetValuePerCreationUnit() {
        return NetAssetValuePerCreationUnit;
    }

    public void setNetAssetValuePerCreationUnit(BigDecimal netAssetValuePerCreationUnit) {
        NetAssetValuePerCreationUnit = netAssetValuePerCreationUnit;
    }

    public String getSignForNetAssetValuePerCreationUnit() {
        return SignForNetAssetValuePerCreationUnit;
    }

    public void setSignForNetAssetValuePerCreationUnit(String signForNetAssetValuePerCreationUnit) {
        SignForNetAssetValuePerCreationUnit = signForNetAssetValuePerCreationUnit;
    }

    public long getEstimatedCashAmountPerETFT_1() {
        return EstimatedCashAmountPerETFT_1;
    }

    public void setEstimatedCashAmountPerETFT_1(long estimatedCashAmountPerETFT_1) {
        EstimatedCashAmountPerETFT_1 = estimatedCashAmountPerETFT_1;
    }

    public String getSignForEstimatedCashAmountPerETFT_1() {
        return SignForEstimatedCashAmountPerETFT_1;
    }

    public void setSignForEstimatedCashAmountPerETFT_1(String signForEstimatedCashAmountPerETFT_1) {
        SignForEstimatedCashAmountPerETFT_1 = signForEstimatedCashAmountPerETFT_1;
    }

    public BigDecimal getNetAssetValuePerETF() {
        return NetAssetValuePerETF;
    }

    public void setNetAssetValuePerETF(BigDecimal netAssetValuePerETF) {
        NetAssetValuePerETF = netAssetValuePerETF;
    }

    public String getSignForNetAssetValuePerETF() {
        return SignForNetAssetValuePerETF;
    }

    public void setSignForNetAssetValuePerETF(String signForNetAssetValuePerETF) {
        SignForNetAssetValuePerETF = signForNetAssetValuePerETF;
    }

    public long getTotalCashAmountPerCreationUnit() {
        return TotalCashAmountPerCreationUnit;
    }

    public void setTotalCashAmountPerCreationUnit(long totalCashAmountPerCreationUnit) {
        TotalCashAmountPerCreationUnit = totalCashAmountPerCreationUnit;
    }

    public String getSignForTotalCashAmountPerCreationUnit() {
        return SignForTotalCashAmountPerCreationUnit;
    }

    public void setSignForTotalCashAmountPerCreationUnit(String signForTotalCashAmountPerCreationUnit) {
        SignForTotalCashAmountPerCreationUnit = signForTotalCashAmountPerCreationUnit;
    }

    public long getTotalSharesOutstandingPerETF() {
        return TotalSharesOutstandingPerETF;
    }

    public void setTotalSharesOutstandingPerETF(long totalSharesOutstandingPerETF) {
        TotalSharesOutstandingPerETF = totalSharesOutstandingPerETF;
    }

    public long getDividendAmountPerETFT_1() {
        return DividendAmountPerETFT_1;
    }

    public void setDividendAmountPerETFT_1(long dividendAmountPerETFT_1) {
        DividendAmountPerETFT_1 = dividendAmountPerETFT_1;
    }

    public String getSignForDividendAmountPerETFT_1() {
        return SignForDividendAmountPerETFT_1;
    }

    public void setSignForDividendAmountPerETFT_1(String signForDividendAmountPerETFT_1) {
        SignForDividendAmountPerETFT_1 = signForDividendAmountPerETFT_1;
    }

    public long getEstValueCashInLieuComponentsPerCreationUnit() {
        return EstValueCashInLieuComponentsPerCreationUnit;
    }

    public void setEstValueCashInLieuComponentsPerCreationUnit(long estValueCashInLieuComponentsPerCreationUnit) {
        EstValueCashInLieuComponentsPerCreationUnit = estValueCashInLieuComponentsPerCreationUnit;
    }

    public String getCashOnlyIndicator() {
        return CashOnlyIndicator;
    }

    public void setCashOnlyIndicator(String cashOnlyIndicator) {
        CashOnlyIndicator = cashOnlyIndicator;
    }

    public int getETFExpenseRatioOnT_1() {
        return ETFExpenseRatioOnT_1;
    }

    public void setETFExpenseRatioOnT_1(int ETFExpenseRatioOnT_1) {
        this.ETFExpenseRatioOnT_1 = ETFExpenseRatioOnT_1;
    }

    public BigDecimal getTotalNetAssetValueETFFundT_1() {
        return TotalNetAssetValueETFFundT_1;
    }

    public void setTotalNetAssetValueETFFundT_1(BigDecimal totalNetAssetValueETFFundT_1) {
        TotalNetAssetValueETFFundT_1 = totalNetAssetValueETFFundT_1;
    }

    public int getETFSharesPerCreateRedeemUnit() {
        return ETFSharesPerCreateRedeemUnit;
    }

    public void setETFSharesPerCreateRedeemUnit(int ETFSharesPerCreateRedeemUnit) {
        this.ETFSharesPerCreateRedeemUnit = ETFSharesPerCreateRedeemUnit;
    }

    public String getETFSymbol() {
        return ETFSymbol;
    }

    public void setETFSymbol(String ETFSymbol) {
        this.ETFSymbol = ETFSymbol;
    }

    public String getCNSEligibilityIndicator() {
        return CNSEligibilityIndicator;
    }

    public void setCNSEligibilityIndicator(String CNSEligibilityIndicator) {
        this.CNSEligibilityIndicator = CNSEligibilityIndicator;
    }

    public String getETFCreateRedeemIdentifier() {
        return ETFCreateRedeemIdentifier;
    }

    public void setETFCreateRedeemIdentifier(String ETFCreateRedeemIdentifier) {
        this.ETFCreateRedeemIdentifier = ETFCreateRedeemIdentifier;
    }

    public String getPriorDayPortfolioBeingUsed() {
        return PriorDayPortfolioBeingUsed;
    }

    public void setPriorDayPortfolioBeingUsed(String priorDayPortfolioBeingUsed) {
        PriorDayPortfolioBeingUsed = priorDayPortfolioBeingUsed;
    }

    public int getBasketType() {
        return BasketType;
    }

    public void setBasketType(int basketType) {
        BasketType = basketType;
    }

    public String getForeignOrDomestic() {
        return ForeignOrDomestic;
    }

    public void setForeignOrDomestic(String foreignOrDomestic) {
        ForeignOrDomestic = foreignOrDomestic;
    }

    public String getNSCCNewPortfolio() {
        return NSCCNewPortfolio;
    }

    public void setNSCCNewPortfolio(String NSCCNewPortfolio) {
        this.NSCCNewPortfolio = NSCCNewPortfolio;
    }

    public String getETFClassificationCode() {
        return ETFClassificationCode;
    }

    public void setETFClassificationCode(String ETFClassificationCode) {
        this.ETFClassificationCode = ETFClassificationCode;
    }

    public int getETFBasketUnitSize() {
        return ETFBasketUnitSize;
    }

    public void setETFBasketUnitSize(int ETFBasketUnitSize) {
        this.ETFBasketUnitSize = ETFBasketUnitSize;
    }

    public int getVariableFees() {
        return VariableFees;
    }

    public void setVariableFees(int variableFees) {
        VariableFees = variableFees;
    }

    public long getBabyBondCashValue() {
        return BabyBondCashValue;
    }

    public void setBabyBondCashValue(long babyBondCashValue) {
        BabyBondCashValue = babyBondCashValue;
    }

    public long getFixedIncomeFaceValueAdjustment() {
        return FixedIncomeFaceValueAdjustment;
    }

    public void setFixedIncomeFaceValueAdjustment(long fixedIncomeFaceValueAdjustment) {
        FixedIncomeFaceValueAdjustment = fixedIncomeFaceValueAdjustment;
    }

    public int getAssetClassificationCodeUnderlyingComponents() {
        return AssetClassificationCodeUnderlyingComponents;
    }

    public void setAssetClassificationCodeUnderlyingComponents(int assetClassificationCodeUnderlyingComponents) {
        AssetClassificationCodeUnderlyingComponents = assetClassificationCodeUnderlyingComponents;
    }

    public int getLeverageIndicatorCode() {
        return LeverageIndicatorCode;
    }

    public void setLeverageIndicatorCode(int leverageIndicatorCode) {
        LeverageIndicatorCode = leverageIndicatorCode;
    }

    public int getLeverageFactor() {
        return LeverageFactor;
    }

    public void setLeverageFactor(int leverageFactor) {
        LeverageFactor = leverageFactor;
    }

    public int getTransferAgentID() {
        return TransferAgentID;
    }

    public void setTransferAgentID(int transferAgentID) {
        TransferAgentID = transferAgentID;
    }

    public String getTransferAgentName() {
        return TransferAgentName;
    }

    public void setTransferAgentName(String transferAgentName) {
        TransferAgentName = transferAgentName;
    }

    public String getFundLEI() {
        return FundLEI;
    }

    public void setFundLEI(String fundLEI) {
        FundLEI = fundLEI;
    }

    public BigDecimal getFundSize() {
        return FundSize;
    }

    public void setFundSize(BigDecimal fundSize) {
        FundSize = fundSize;
    }

    public int getShareClassApportionmentRatio() {
        return ShareClassApportionmentRatio;
    }

    public void setShareClassApportionmentRatio(int shareClassApportionmentRatio) {
        ShareClassApportionmentRatio = shareClassApportionmentRatio;
    }

    public int getProjectedTransactionFee() {
        return ProjectedTransactionFee;
    }

    public void setProjectedTransactionFee(int projectedTransactionFee) {
        ProjectedTransactionFee = projectedTransactionFee;
    }

    public Date getDateForProjectedTransactionFee() {
        return DateForProjectedTransactionFee;
    }

    public void setDateForProjectedTransactionFee(Date dateForProjectedTransactionFee) {
        DateForProjectedTransactionFee = dateForProjectedTransactionFee;
    }

    public int getConfirmedTransactionFee() {
        return ConfirmedTransactionFee;
    }

    public void setConfirmedTransactionFee(int confirmedTransactionFee) {
        ConfirmedTransactionFee = confirmedTransactionFee;
    }

    public Date getDateForConfirmedTransactionFee() {
        return DateForConfirmedTransactionFee;
    }

    public void setDateForConfirmedTransactionFee(Date dateForConfirmedTransactionFee) {
        DateForConfirmedTransactionFee = dateForConfirmedTransactionFee;
    }

    public long getProjectedCashForPricingBasket() {
        return ProjectedCashForPricingBasket;
    }

    public void setProjectedCashForPricingBasket(long projectedCashForPricingBasket) {
        ProjectedCashForPricingBasket = projectedCashForPricingBasket;
    }

    public int getBasketsOutstanding() {
        return BasketsOutstanding;
    }

    public void setBasketsOutstanding(int basketsOutstanding) {
        BasketsOutstanding = basketsOutstanding;
    }

    public String getPricingUsageIndicator() {
        return PricingUsageIndicator;
    }

    public void setPricingUsageIndicator(String pricingUsageIndicator) {
        PricingUsageIndicator = pricingUsageIndicator;
    }

    public String getCreationOrderUsage() {
        return CreationOrderUsage;
    }

    public void setCreationOrderUsage(String creationOrderUsage) {
        CreationOrderUsage = creationOrderUsage;
    }

    public String getRedemptionOrderUsage() {
        return RedemptionOrderUsage;
    }

    public void setRedemptionOrderUsage(String redemptionOrderUsage) {
        RedemptionOrderUsage = redemptionOrderUsage;
    }

    public String getFutureUse() {
        return FutureUse;
    }

    public void setFutureUse(String futureUse) {
        FutureUse = futureUse;
    }

    @Override
    public String toString() {
        return "ETF{" +
                "constituents=" + constituents +
                ", recordType='" + recordType + '\'' +
                ", CUSIP='" + CUSIP + '\'' +
                ", ISIN='" + ISIN + '\'' +
                ", NSCCPortfolioID='" + NSCCPortfolioID + '\'' +
                ", Description='" + Description + '\'' +
                ", TradeDate=" + TradeDate +
                ", ETFAgent='" + ETFAgent + '\'' +
                ", ComponentCount=" + ComponentCount +
                ", EstCashAmountPerCreationTminus1=" + EstCashAmountPerCreationTminus1 +
                ", SignForEstCashAmountPerCreationTminus1='" + SignForEstCashAmountPerCreationTminus1 + '\'' +
                ", NetAssetValuePerCreationUnit=" + NetAssetValuePerCreationUnit +
                ", SignForNetAssetValuePerCreationUnit='" + SignForNetAssetValuePerCreationUnit + '\'' +
                ", EstimatedCashAmountPerETFT_1=" + EstimatedCashAmountPerETFT_1 +
                ", SignForEstimatedCashAmountPerETFT_1='" + SignForEstimatedCashAmountPerETFT_1 + '\'' +
                ", NetAssetValuePerETF=" + NetAssetValuePerETF +
                ", SignForNetAssetValuePerETF='" + SignForNetAssetValuePerETF + '\'' +
                ", TotalCashAmountPerCreationUnit=" + TotalCashAmountPerCreationUnit +
                ", SignForTotalCashAmountPerCreationUnit='" + SignForTotalCashAmountPerCreationUnit + '\'' +
                ", TotalSharesOutstandingPerETF=" + TotalSharesOutstandingPerETF +
                ", DividendAmountPerETFT_1=" + DividendAmountPerETFT_1 +
                ", SignForDividendAmountPerETFT_1='" + SignForDividendAmountPerETFT_1 + '\'' +
                ", EstValueCashInLieuComponentsPerCreationUnit=" + EstValueCashInLieuComponentsPerCreationUnit +
                ", CashOnlyIndicator='" + CashOnlyIndicator + '\'' +
                ", ETFExpenseRatioOnT_1=" + ETFExpenseRatioOnT_1 +
                ", TotalNetAssetValueETFFundT_1=" + TotalNetAssetValueETFFundT_1 +
                ", ETFSharesPerCreateRedeemUnit=" + ETFSharesPerCreateRedeemUnit +
                ", ETFSymbol='" + ETFSymbol + '\'' +
                ", CNSEligibilityIndicator='" + CNSEligibilityIndicator + '\'' +
                ", ETFCreateRedeemIdentifier='" + ETFCreateRedeemIdentifier + '\'' +
                ", PriorDayPortfolioBeingUsed='" + PriorDayPortfolioBeingUsed + '\'' +
                ", BasketType=" + BasketType +
                ", ForeignOrDomestic='" + ForeignOrDomestic + '\'' +
                ", NSCCNewPortfolio='" + NSCCNewPortfolio + '\'' +
                ", ETFClassificationCode='" + ETFClassificationCode + '\'' +
                ", ETFBasketUnitSize=" + ETFBasketUnitSize +
                ", VariableFees=" + VariableFees +
                ", BabyBondCashValue=" + BabyBondCashValue +
                ", FixedIncomeFaceValueAdjustment=" + FixedIncomeFaceValueAdjustment +
                ", AssetClassificationCodeUnderlyingComponents=" + AssetClassificationCodeUnderlyingComponents +
                ", LeverageIndicatorCode=" + LeverageIndicatorCode +
                ", LeverageFactor=" + LeverageFactor +
                ", TransferAgentID=" + TransferAgentID +
                ", TransferAgentName='" + TransferAgentName + '\'' +
                ", FundLEI='" + FundLEI + '\'' +
                ", FundSize=" + FundSize +
                ", ShareClassApportionmentRatio=" + ShareClassApportionmentRatio +
                ", ProjectedTransactionFee=" + ProjectedTransactionFee +
                ", DateForProjectedTransactionFee=" + DateForProjectedTransactionFee +
                ", ConfirmedTransactionFee=" + ConfirmedTransactionFee +
                ", DateForConfirmedTransactionFee=" + DateForConfirmedTransactionFee +
                ", ProjectedCashForPricingBasket=" + ProjectedCashForPricingBasket +
                ", BasketsOutstanding=" + BasketsOutstanding +
                ", PricingUsageIndicator='" + PricingUsageIndicator + '\'' +
                ", CreationOrderUsage='" + CreationOrderUsage + '\'' +
                ", RedemptionOrderUsage='" + RedemptionOrderUsage + '\'' +
                ", FutureUse='" + FutureUse + '\'' +
                '}';
    }
}
