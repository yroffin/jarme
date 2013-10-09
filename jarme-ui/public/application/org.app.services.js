'use strict';

/* App Services module */

angular.module('jarmeServices', ['ngResource'], 
	function($provide) {
		/**
		 * jarme provider
		 */
		console.info('Register jarme services');
		$provide.factory('Jarme', function($resource) {
			return $resource('', {}, {
				send: {url: '/rest/send', method:'POST', isArray:false, cache:false},
				execute: {url: '/rest/execute', method:'POST', isArray:false, cache:false}
			});
		});
	});
