/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.core.web.money;

import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.ServletRequest;

import org.broadleafcommerce.common.money.CurrencyConversionService;

public interface CurrencyConversionPricingFilter extends Filter {
    
    @SuppressWarnings("rawtypes")
    public HashMap getCurrencyConversionContext(ServletRequest request);
    
    public CurrencyConversionService getCurrencyConversionService(ServletRequest request);
    
}
