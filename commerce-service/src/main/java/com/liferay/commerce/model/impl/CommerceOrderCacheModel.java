/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.model.CommerceOrder;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.math.BigDecimal;

import java.util.Date;

/**
 * The cache model class for representing CommerceOrder in entity cache.
 *
 * @author Alessio Antonio Rendina
 * @see CommerceOrder
 * @generated
 */
@ProviderType
public class CommerceOrderCacheModel implements CacheModel<CommerceOrder>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CommerceOrderCacheModel)) {
			return false;
		}

		CommerceOrderCacheModel commerceOrderCacheModel = (CommerceOrderCacheModel)obj;

		if (commerceOrderId == commerceOrderCacheModel.commerceOrderId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, commerceOrderId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(89);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", commerceOrderId=");
		sb.append(commerceOrderId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", siteGroupId=");
		sb.append(siteGroupId);
		sb.append(", orderOrganizationId=");
		sb.append(orderOrganizationId);
		sb.append(", orderUserId=");
		sb.append(orderUserId);
		sb.append(", commerceCurrencyId=");
		sb.append(commerceCurrencyId);
		sb.append(", billingAddressId=");
		sb.append(billingAddressId);
		sb.append(", shippingAddressId=");
		sb.append(shippingAddressId);
		sb.append(", commercePaymentMethodId=");
		sb.append(commercePaymentMethodId);
		sb.append(", commerceShippingMethodId=");
		sb.append(commerceShippingMethodId);
		sb.append(", shippingOptionName=");
		sb.append(shippingOptionName);
		sb.append(", purchaseOrderNumber=");
		sb.append(purchaseOrderNumber);
		sb.append(", subtotal=");
		sb.append(subtotal);
		sb.append(", subtotalDiscountAmount=");
		sb.append(subtotalDiscountAmount);
		sb.append(", subtotalDiscountPercentageLevel1=");
		sb.append(subtotalDiscountPercentageLevel1);
		sb.append(", subtotalDiscountPercentageLevel2=");
		sb.append(subtotalDiscountPercentageLevel2);
		sb.append(", subtotalDiscountPercentageLevel3=");
		sb.append(subtotalDiscountPercentageLevel3);
		sb.append(", subtotalDiscountPercentageLevel4=");
		sb.append(subtotalDiscountPercentageLevel4);
		sb.append(", shippingAmount=");
		sb.append(shippingAmount);
		sb.append(", shippingDiscountAmount=");
		sb.append(shippingDiscountAmount);
		sb.append(", shippingDiscountPercentageLevel1=");
		sb.append(shippingDiscountPercentageLevel1);
		sb.append(", shippingDiscountPercentageLevel2=");
		sb.append(shippingDiscountPercentageLevel2);
		sb.append(", shippingDiscountPercentageLevel3=");
		sb.append(shippingDiscountPercentageLevel3);
		sb.append(", shippingDiscountPercentageLevel4=");
		sb.append(shippingDiscountPercentageLevel4);
		sb.append(", taxAmount=");
		sb.append(taxAmount);
		sb.append(", total=");
		sb.append(total);
		sb.append(", totalDiscountAmount=");
		sb.append(totalDiscountAmount);
		sb.append(", totalDiscountPercentageLevel1=");
		sb.append(totalDiscountPercentageLevel1);
		sb.append(", totalDiscountPercentageLevel2=");
		sb.append(totalDiscountPercentageLevel2);
		sb.append(", totalDiscountPercentageLevel3=");
		sb.append(totalDiscountPercentageLevel3);
		sb.append(", totalDiscountPercentageLevel4=");
		sb.append(totalDiscountPercentageLevel4);
		sb.append(", advanceStatus=");
		sb.append(advanceStatus);
		sb.append(", paymentStatus=");
		sb.append(paymentStatus);
		sb.append(", orderStatus=");
		sb.append(orderStatus);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CommerceOrder toEntityModel() {
		CommerceOrderImpl commerceOrderImpl = new CommerceOrderImpl();

		if (uuid == null) {
			commerceOrderImpl.setUuid("");
		}
		else {
			commerceOrderImpl.setUuid(uuid);
		}

		commerceOrderImpl.setCommerceOrderId(commerceOrderId);
		commerceOrderImpl.setGroupId(groupId);
		commerceOrderImpl.setCompanyId(companyId);
		commerceOrderImpl.setUserId(userId);

		if (userName == null) {
			commerceOrderImpl.setUserName("");
		}
		else {
			commerceOrderImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			commerceOrderImpl.setCreateDate(null);
		}
		else {
			commerceOrderImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			commerceOrderImpl.setModifiedDate(null);
		}
		else {
			commerceOrderImpl.setModifiedDate(new Date(modifiedDate));
		}

		commerceOrderImpl.setSiteGroupId(siteGroupId);
		commerceOrderImpl.setOrderOrganizationId(orderOrganizationId);
		commerceOrderImpl.setOrderUserId(orderUserId);
		commerceOrderImpl.setCommerceCurrencyId(commerceCurrencyId);
		commerceOrderImpl.setBillingAddressId(billingAddressId);
		commerceOrderImpl.setShippingAddressId(shippingAddressId);
		commerceOrderImpl.setCommercePaymentMethodId(commercePaymentMethodId);
		commerceOrderImpl.setCommerceShippingMethodId(commerceShippingMethodId);

		if (shippingOptionName == null) {
			commerceOrderImpl.setShippingOptionName("");
		}
		else {
			commerceOrderImpl.setShippingOptionName(shippingOptionName);
		}

		if (purchaseOrderNumber == null) {
			commerceOrderImpl.setPurchaseOrderNumber("");
		}
		else {
			commerceOrderImpl.setPurchaseOrderNumber(purchaseOrderNumber);
		}

		commerceOrderImpl.setSubtotal(subtotal);
		commerceOrderImpl.setSubtotalDiscountAmount(subtotalDiscountAmount);
		commerceOrderImpl.setSubtotalDiscountPercentageLevel1(subtotalDiscountPercentageLevel1);
		commerceOrderImpl.setSubtotalDiscountPercentageLevel2(subtotalDiscountPercentageLevel2);
		commerceOrderImpl.setSubtotalDiscountPercentageLevel3(subtotalDiscountPercentageLevel3);
		commerceOrderImpl.setSubtotalDiscountPercentageLevel4(subtotalDiscountPercentageLevel4);
		commerceOrderImpl.setShippingAmount(shippingAmount);
		commerceOrderImpl.setShippingDiscountAmount(shippingDiscountAmount);
		commerceOrderImpl.setShippingDiscountPercentageLevel1(shippingDiscountPercentageLevel1);
		commerceOrderImpl.setShippingDiscountPercentageLevel2(shippingDiscountPercentageLevel2);
		commerceOrderImpl.setShippingDiscountPercentageLevel3(shippingDiscountPercentageLevel3);
		commerceOrderImpl.setShippingDiscountPercentageLevel4(shippingDiscountPercentageLevel4);
		commerceOrderImpl.setTaxAmount(taxAmount);
		commerceOrderImpl.setTotal(total);
		commerceOrderImpl.setTotalDiscountAmount(totalDiscountAmount);
		commerceOrderImpl.setTotalDiscountPercentageLevel1(totalDiscountPercentageLevel1);
		commerceOrderImpl.setTotalDiscountPercentageLevel2(totalDiscountPercentageLevel2);
		commerceOrderImpl.setTotalDiscountPercentageLevel3(totalDiscountPercentageLevel3);
		commerceOrderImpl.setTotalDiscountPercentageLevel4(totalDiscountPercentageLevel4);

		if (advanceStatus == null) {
			commerceOrderImpl.setAdvanceStatus("");
		}
		else {
			commerceOrderImpl.setAdvanceStatus(advanceStatus);
		}

		commerceOrderImpl.setPaymentStatus(paymentStatus);
		commerceOrderImpl.setOrderStatus(orderStatus);
		commerceOrderImpl.setStatus(status);
		commerceOrderImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			commerceOrderImpl.setStatusByUserName("");
		}
		else {
			commerceOrderImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			commerceOrderImpl.setStatusDate(null);
		}
		else {
			commerceOrderImpl.setStatusDate(new Date(statusDate));
		}

		commerceOrderImpl.resetOriginalValues();

		return commerceOrderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput)
		throws ClassNotFoundException, IOException {
		uuid = objectInput.readUTF();

		commerceOrderId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		siteGroupId = objectInput.readLong();

		orderOrganizationId = objectInput.readLong();

		orderUserId = objectInput.readLong();

		commerceCurrencyId = objectInput.readLong();

		billingAddressId = objectInput.readLong();

		shippingAddressId = objectInput.readLong();

		commercePaymentMethodId = objectInput.readLong();

		commerceShippingMethodId = objectInput.readLong();
		shippingOptionName = objectInput.readUTF();
		purchaseOrderNumber = objectInput.readUTF();
		subtotal = (BigDecimal)objectInput.readObject();
		subtotalDiscountAmount = (BigDecimal)objectInput.readObject();
		subtotalDiscountPercentageLevel1 = (BigDecimal)objectInput.readObject();
		subtotalDiscountPercentageLevel2 = (BigDecimal)objectInput.readObject();
		subtotalDiscountPercentageLevel3 = (BigDecimal)objectInput.readObject();
		subtotalDiscountPercentageLevel4 = (BigDecimal)objectInput.readObject();
		shippingAmount = (BigDecimal)objectInput.readObject();
		shippingDiscountAmount = (BigDecimal)objectInput.readObject();
		shippingDiscountPercentageLevel1 = (BigDecimal)objectInput.readObject();
		shippingDiscountPercentageLevel2 = (BigDecimal)objectInput.readObject();
		shippingDiscountPercentageLevel3 = (BigDecimal)objectInput.readObject();
		shippingDiscountPercentageLevel4 = (BigDecimal)objectInput.readObject();
		taxAmount = (BigDecimal)objectInput.readObject();
		total = (BigDecimal)objectInput.readObject();
		totalDiscountAmount = (BigDecimal)objectInput.readObject();
		totalDiscountPercentageLevel1 = (BigDecimal)objectInput.readObject();
		totalDiscountPercentageLevel2 = (BigDecimal)objectInput.readObject();
		totalDiscountPercentageLevel3 = (BigDecimal)objectInput.readObject();
		totalDiscountPercentageLevel4 = (BigDecimal)objectInput.readObject();
		advanceStatus = objectInput.readUTF();

		paymentStatus = objectInput.readInt();

		orderStatus = objectInput.readInt();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(commerceOrderId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(siteGroupId);

		objectOutput.writeLong(orderOrganizationId);

		objectOutput.writeLong(orderUserId);

		objectOutput.writeLong(commerceCurrencyId);

		objectOutput.writeLong(billingAddressId);

		objectOutput.writeLong(shippingAddressId);

		objectOutput.writeLong(commercePaymentMethodId);

		objectOutput.writeLong(commerceShippingMethodId);

		if (shippingOptionName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shippingOptionName);
		}

		if (purchaseOrderNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(purchaseOrderNumber);
		}

		objectOutput.writeObject(subtotal);
		objectOutput.writeObject(subtotalDiscountAmount);
		objectOutput.writeObject(subtotalDiscountPercentageLevel1);
		objectOutput.writeObject(subtotalDiscountPercentageLevel2);
		objectOutput.writeObject(subtotalDiscountPercentageLevel3);
		objectOutput.writeObject(subtotalDiscountPercentageLevel4);
		objectOutput.writeObject(shippingAmount);
		objectOutput.writeObject(shippingDiscountAmount);
		objectOutput.writeObject(shippingDiscountPercentageLevel1);
		objectOutput.writeObject(shippingDiscountPercentageLevel2);
		objectOutput.writeObject(shippingDiscountPercentageLevel3);
		objectOutput.writeObject(shippingDiscountPercentageLevel4);
		objectOutput.writeObject(taxAmount);
		objectOutput.writeObject(total);
		objectOutput.writeObject(totalDiscountAmount);
		objectOutput.writeObject(totalDiscountPercentageLevel1);
		objectOutput.writeObject(totalDiscountPercentageLevel2);
		objectOutput.writeObject(totalDiscountPercentageLevel3);
		objectOutput.writeObject(totalDiscountPercentageLevel4);

		if (advanceStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(advanceStatus);
		}

		objectOutput.writeInt(paymentStatus);

		objectOutput.writeInt(orderStatus);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long commerceOrderId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long siteGroupId;
	public long orderOrganizationId;
	public long orderUserId;
	public long commerceCurrencyId;
	public long billingAddressId;
	public long shippingAddressId;
	public long commercePaymentMethodId;
	public long commerceShippingMethodId;
	public String shippingOptionName;
	public String purchaseOrderNumber;
	public BigDecimal subtotal;
	public BigDecimal subtotalDiscountAmount;
	public BigDecimal subtotalDiscountPercentageLevel1;
	public BigDecimal subtotalDiscountPercentageLevel2;
	public BigDecimal subtotalDiscountPercentageLevel3;
	public BigDecimal subtotalDiscountPercentageLevel4;
	public BigDecimal shippingAmount;
	public BigDecimal shippingDiscountAmount;
	public BigDecimal shippingDiscountPercentageLevel1;
	public BigDecimal shippingDiscountPercentageLevel2;
	public BigDecimal shippingDiscountPercentageLevel3;
	public BigDecimal shippingDiscountPercentageLevel4;
	public BigDecimal taxAmount;
	public BigDecimal total;
	public BigDecimal totalDiscountAmount;
	public BigDecimal totalDiscountPercentageLevel1;
	public BigDecimal totalDiscountPercentageLevel2;
	public BigDecimal totalDiscountPercentageLevel3;
	public BigDecimal totalDiscountPercentageLevel4;
	public String advanceStatus;
	public int paymentStatus;
	public int orderStatus;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
}