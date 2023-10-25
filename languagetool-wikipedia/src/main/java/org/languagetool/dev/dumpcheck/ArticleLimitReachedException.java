/* LanguageTool, a natural language style checker
 * Copyright (C) 2012 Daniel Naber (http://www.danielnaber.de)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.dev.dumpcheck;

/**
 * @deprecated deprecated October 2019 - doesn't seem to be used
 */
public class ArticleLimitReachedException extends RuntimeException {

  private final int limit;

  public ArticleLimitReachedException(int limit) {
    this.limit = limit;
  }

  protected SpanishMultitokenSpeller() {
    super(Languages.getLanguageForShortCode("es"),
      Arrays.asList("/es/multiwords.txt", "/spelling_global.txt", "/es/hyphenated_words.txt"));
  }

}
