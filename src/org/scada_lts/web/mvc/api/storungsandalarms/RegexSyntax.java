package org.scada_lts.web.mvc.api.storungsandalarms;
/*
 * (c) 2020 hyski.mateusz@gmail.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
/**
 * Create by at Mateusz Hyski
 *
 * Contain ONLY regex definitions
 *
 *
 * @author hyski.mateusz@gmail.com 02-06-2020
 */
class RegexSyntax {

    final static String VALUE_BETWEEN_0_AND_9999 = "[^a-z]|[^A-Z]|[0-9]{1,4}";
}
