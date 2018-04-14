/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

JW_APP_NAME.directive('animatedChange', animatedChange);

function animatedChange($timeout) {
    return {
        link: function (scope, element) {
            $timeout(function () {
                var newValue = element.attr('new-value');
                var oldvalue = parseInt(element.html());

                function changeValue(val) {
                    $timeout(function () {
                        element.html(val);
                    }, 30);
                }

                if (newValue > oldvalue) {
                    for (var i = oldvalue; i <= newValue; i++) {
                        changeValue(i);
                    }
                } else {
                    for (var j = oldvalue; j >= newValue; j--) {
                        changeValue(j);
                    }
                }
                $timeout(function () {
                    element.next().find('i').addClass('show-arr');
                }, 500);
            }, 3500);
        }
    };
}
