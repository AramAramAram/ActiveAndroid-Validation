/*
 * Copyright (C) 2013 Vojtech Sigler.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cz.sigler.android.aavalidation.api.error;

import java.util.List;

/**
 * Exception thrown when trying to save a model whose validation fails.
 */
public class ValidationException extends Exception {

	/** List of reported errors. */
	private List<ValidationError> errors;

	/**
	 * @return list of errors
	 */
	public List<ValidationError> getErrors() {
		return errors;
	}

	/**
	 * Constructor.
	 * 
	 * @param errors 
	 *			list of errors
	 */
	public ValidationException(final List<ValidationError> errors) {
		this.errors = errors;
	}
}
